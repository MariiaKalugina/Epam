/**
 * Class for user playing: get coordinate, convert letter, shot and fill cells certain value.
 */
package com.epam.battle;

import com.epam.battle.ships.Ship;

public class Coordinate {
    private int x;
    private int y;

    public Coordinate(char letter, int number) {
        x = number - 1;
        y = convertCharToInt(letter) - 1;
    }

    int convertCharToInt(char letter) {
        int secondNumber;
        switch (letter) {
            case 'a':
                secondNumber = 1;
                break;
            case 'b':
                secondNumber = 2;
                break;
            case 'c':
                secondNumber = 3;
                break;
            case 'd':
                secondNumber = 4;
                break;
            case 'e':
                secondNumber = 5;
                break;
            case 'f':
                secondNumber = 6;
                break;
            case 'g':
                secondNumber = 7;
                break;
            case 'h':
                secondNumber = 8;
                break;
            case 'i':
                secondNumber = 9;
                break;
            case 'j':
                secondNumber = 10;
                break;
            default:
                throw new IllegalArgumentException("Letter must be from a to j!");
        }
        return secondNumber;
    }

    boolean getShot(FieldGeneration field, Ship[] ships) {
        if (field.getCell(x, y) == 0) {
            System.out.println("Miss");
            field.setCell(-1, x, y);
        } else {
            if (field.getCell(x, y) > 0) {
                // Ship is dead
                if (!ships[field.getCell(x, y) - 1].hit()) {
                    killShip(field, ships[field.getCell(x, y) - 1]);
                } else {
                    System.out.println("Ship is hurt!");
                    field.setCell(-2, x, y);
                }
                return true;
            }
        }
        return false;
    }

    void killShip(FieldGeneration field, Ship ship) {
        System.out.println("Ship is dead!");
        int[] coordX = ship.getCoordinateX();
        int[] coordY = ship.getCoordinateY();
        //Filling cells around the ship
        for (int i = 0; i < coordX.length; i++) {
            for (int ii = -1; ii <= 1; ii++) {
                for (int jj = -1; jj <= 1; jj++) {
                    if (coordX[i] + ii >= 0 && coordX[i] + ii <= 9) {
                        if (coordY[i] + jj >= 0 && coordY[i] + jj <= 9) {
                            field.setCell(-1, coordX[i] + ii, coordY[i] + jj);
                        }
                    }
                }
            }
        }
        // Filling the ship's cells
        for (int i = 0; i < coordX.length; i++) {
            field.setCell(-3, coordX[i], coordY[i]);
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
