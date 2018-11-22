package com.epam.battle.ships;

public class FourDeskShip extends Ship {

    public FourDeskShip(int i) {
        size = 4;
        index = i;
        coordinateX = new int[size];
        coordinateY = new int[size];
        lifes = size;
    }
}
