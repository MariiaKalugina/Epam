/**
 * Class with main variables and methods for ships.
 */
package com.epam.battle.ships;

public abstract class Ship {
    int size;
    int index;
    int lifes;
    int[] coordinateX;
    int[] coordinateY;

    public int[] getCoordinateX() {
        return coordinateX;
    }

    public int[] getCoordinateY() {
        return coordinateY;
    }

    public int getIndex() {
        return index;
    }

    public int getSize() {
        return size;
    }

    public void addCoordinate(int i, int x, int y) {
        coordinateX[i] = x;
        coordinateY[i] = y;
    }

    public boolean hit() {
        lifes--;
        return 0 < lifes;
    }

    public boolean isLife() {
        return 0 < lifes;
    }
}
