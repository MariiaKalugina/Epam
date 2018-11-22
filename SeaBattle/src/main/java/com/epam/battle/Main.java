/**
 * Main class for game SeaBattle.
 * The rules were taken from classic version of game.
 * You have to find and kill all enemy`s ships and don`t lose yours.
 * You ships and ships of your enemy generate automatically.
 * Good luck!
 */
package com.epam.battle;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
