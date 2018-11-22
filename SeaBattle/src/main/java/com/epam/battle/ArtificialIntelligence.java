/**
 * Class for computer playing: random shot, try to kill ship when hurt it.
 */
package com.epam.battle;

import com.epam.battle.ships.Ship;

import java.util.Random;

public class ArtificialIntelligence {
    int x;
    char y;
    int initX;
    char initY;
    private boolean isShipFound;
    private boolean isShipVertical;
    private boolean isFirstCheck;
    private Coordinate coordinate;
    private FieldGeneration field;
    private Ship[] ships;
    private int lastShip;

    public ArtificialIntelligence() {
        isShipFound = false;
        isShipVertical = false;
        isFirstCheck = true;
    }

    public boolean getShot(FieldGeneration field, Ship[] ships) {
        this.field = field;
        this.ships = ships;
        if (isShipFound && ships[lastShip].isLife()) {
            if (isShipVertical) {
                return checkVertical();
            } else {
                return checkHorizontal();
            }
        } else {
            randomCoordinate();
            isShipFound = false;
            isShipVertical = false;
            isFirstCheck = true;
            System.out.printf("I'm shot to " + y + " " + x + "!\n");
            System.out.print("And my result: ");
            lastShip = field.getCell(coordinate.getX(), coordinate.getY());
            lastShip--;
            if (coordinate.getShot(field, ships)) {
                isShipFound = true;
                return true;
            }
            return false;
        }
    }

    private void randomCoordinate() {
        while (true) {
            Random random = new Random();
            initY = (char) (random.nextInt('j' - 'a') + 'a');
            initX = 1 + (int) (Math.random() * 10);
            coordinate = new Coordinate(initY, initX);
            if (field.getCell(coordinate.getX(), coordinate.getY()) >= 0)
                break;
        }
        x = initX;
        y = initY;
    }

    private boolean checkHorizontal() {
        if (isFirstCheck && y != 'a') {
            y--;
            if (!checkCoordinate(y, x)) {
                isFirstCheck = false;
                return false;
            } else return true;

        } else if (y != 'j') {
            isFirstCheck = false;
            y++;
            if (!checkCoordinate(y, x)) {
                isShipVertical = true;
                isFirstCheck = true;
                return false;
            }
            return true;
        } else {
            isFirstCheck = true;
            isShipVertical = true;
            return false;
        }
    }

    private boolean checkCoordinate(char y, int x) {
        coordinate = new Coordinate(y, x);
        if (!coordinate.getShot(field, ships)) {
            System.out.printf("I'm shot to " + y + " " + x + "!\n");
            System.out.print("And my result: ");
            isFirstCheck = false;
            y = initY;
            x = initX;
            return false;
        }
        return true;
    }

    private boolean checkVertical() {
        if (isFirstCheck && x != 1) {
            x--;
            if (!checkCoordinate(y, x)) {
                isFirstCheck = false;
                return false;
            } else return true;
        } else {
            isFirstCheck = false;
            x++;
            return checkCoordinate(y, x);
        }
    }
}
