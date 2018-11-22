/**
 * Class generation ships on field: get random coordinate and route of ship, check for ships near.
 */
package com.epam.battle;

import com.epam.battle.ships.Ship;

public class FieldGeneration {
    private Field fieldWithShips = new Field();
    private int startX;
    private int startY;

    private void generateShips(Ship ship) {
        int to;
        int right = 0;
        int down = 0;
        boolean success = false;
        while (!success) {
            to = 1 + (int) (Math.random() * 2);
            //to = 2;
            if (to == 1) {
                right = ship.getSize();
            } else if (to == 2) {
                down = ship.getSize();
            }
            startX = (int) (Math.random() * (10 - down));
            startY = (int) (Math.random() * (10 - right));
            // right
            if (to == 1) {
                if (isEmpty(false, ship)) {
                    for (int i = 0; i < ship.getSize(); i++) {
                        fieldWithShips.map[startX][startY + i] = ship.getIndex();
                        ship.addCoordinate(i, startX, startY + i);
                        success = true;
                    }
                }
                // down
            } else if (to == 2) {
                if (isEmpty(true, ship)) {
                    for (int i = 0; i < ship.getSize(); i++) {
                        fieldWithShips.map[startX + i][startY] = ship.getIndex();
                        ship.addCoordinate(i, startX + i, startY);
                        success = true;
                    }
                }
            }
        }
    }

    private boolean isEmpty(boolean vertical, Ship ship) {
        int size = ship.getSize();
        if (!vertical) {
            for (int i = startY; i < startY + size; i++) {
                if (fieldWithShips.map[startX][i] != 0 || isShipNear(startX, i)) {
                    return false;
                }
            }
        } else if (vertical) {
            for (int i = startX; i < startX + size; i++) {
                if (fieldWithShips.map[i][startY] != 0 || isShipNear(i, startY)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isShipNear(int gorCoord, int verCoord) {
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (gorCoord + i >= 0 && gorCoord + i <= 9) {
                    if (verCoord + j >= 0 && verCoord + j <= 9) {
                        if (fieldWithShips.map[gorCoord + i][verCoord + j] != 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public void setCell(int i, int x, int y) {
        fieldWithShips.map[x][y] = i;
    }

    public int getCell(int x, int y) {
        return fieldWithShips.map[x][y];
    }

    public Field getField() {
        return fieldWithShips;
    }

    void initialize(Ship[] ships) {
        for (Ship ship : ships) {
            generateShips(ship);
        }
    }
}
