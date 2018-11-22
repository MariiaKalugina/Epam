package com.epam.battle.ships;

public class ThreeDeskShip extends Ship {

    public ThreeDeskShip(int i) {
        size = 3;
        index = i;
        coordinateX = new int[size];
        coordinateY = new int[size];
        lifes = size;
    }
}
