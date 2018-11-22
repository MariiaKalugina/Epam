/**
 * Class with start game: initialise players ships, fields, run game process while either you win or computer.
 */
package com.epam.battle;

import com.epam.battle.ships.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
    private Ship[] userShips = new Ship[10];
    private Ship[] compShips = new Ship[10];
    private Visualization visualization = new Visualization();
    private FieldGeneration userPlayerField = new FieldGeneration();
    private FieldGeneration compPlayerField = new FieldGeneration();

    void start() {
        userShips = createShips();
        compShips = createShips();
        System.out.println("Start game! Your field with ships generates automatically!");
        System.out.println("It is your ships!");
        userPlayerField.initialize(userShips);
        visualization.paintOpenField(userPlayerField.getField());
        compPlayerField.initialize(compShips);
        System.out.println();
        System.out.println("It is computer field!");
        visualization.paintCloseField(compPlayerField.getField());
        System.out.println("Input coordinate in order: letter, number and shut at computer`s ship!");
        if (isGameProcess()) {
            System.out.println("You win!");
        } else {
            System.out.println("You loser! xaxaxa");
        }
    }

    private Ship[] createShips() {
        Ship[] ships = new Ship[10];
        ships[0] = new FourDeskShip(1);
        ships[1] = new ThreeDeskShip(2);
        ships[2] = new ThreeDeskShip(3);
        ships[3] = new TwoDeskShip(4);
        ships[4] = new TwoDeskShip(5);
        ships[5] = new TwoDeskShip(6);
        ships[6] = new OneDeskShip(7);
        ships[7] = new OneDeskShip(8);
        ships[8] = new OneDeskShip(9);
        ships[9] = new OneDeskShip(10);
        return ships;
    }

    private boolean isGameProcess() {
        char letter = ' ';
        int number = 0;
        int lifeUserShips = 0;
        for (Ship ship : userShips) {
            lifeUserShips += ship.getSize();
        }
        int lifeCompShips = 0;
        for (Ship ship : compShips) {
            lifeCompShips += ship.getSize();
        }
        ArtificialIntelligence ai = new ArtificialIntelligence();
        while (lifeUserShips > 0 && lifeCompShips > 0) {
            System.out.println("----------------=====User: =====-------------------");
            visualization.paintOpenField(userPlayerField.getField());
            System.out.println("----------------=====COMP: =====-------------------");
            visualization.paintCloseField(compPlayerField.getField());
            boolean bLetter = true;
            boolean bNumber = true;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                while (bLetter) {
                    System.out.println("Letter: ");
                    String temp = reader.readLine();
                    letter = (temp.length() > 0) ? temp.charAt(0) : 'z';
                    if (!((letter >= 'a') && (letter <= 'j'))) {
                        System.err.println("Letter must be from a to j!");
                    } else {
                        bLetter = false;
                    }
                }
                while (bNumber) {
                    System.out.println("Number: ");
                    String temp = reader.readLine();
                    number = (temp.length() > 0) ? Integer.parseInt(temp) : 11;
                    if (number < 1 || number > 10) {
                        System.err.println("Number must be from 1 to 10!");
                    } else {
                        bNumber = false;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            Coordinate coordinate = new Coordinate(letter, number);
            if (coordinate.getShot(compPlayerField, compShips)) {
                lifeCompShips--;
            }
            if (ai.getShot(userPlayerField, userShips)) {
                lifeUserShips--;
            }
        }
        return 0 < lifeUserShips;
    }
}
