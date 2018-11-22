/**
 * Class with display field on console.
 */
package com.epam.battle;

public class Visualization {
    public String[][] map = {{"  |a b c d e f g h i j |"},
            {" 1|", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "|1"},
            {" 2|", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "|2"},
            {" 3|", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "|3"},
            {" 4|", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "|4"},
            {" 5|", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "|5"},
            {" 6|", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "|6"},
            {" 7|", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "|7"},
            {" 8|", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "|8"},
            {" 9|", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "|9"},
            {"10|", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "* ", "|10"}};

    void paintOpenField(Field field) {
        for (int i = 1; i < map.length; i++) {
            for (int j = 1; j < map[i].length - 1; j++) {
                if (field.map[i - 1][j - 1] > 0) {
                    map[i][j] = "X ";
                } else if (field.map[i - 1][j - 1] == 0) {
                    map[i][j] = "~ ";
                } else if (field.map[i - 1][j - 1] == -1) {
                    map[i][j] = "* ";
                } else if (field.map[i - 1][j - 1] == -2) {
                    map[i][j] = "x ";
                } else if (field.map[i - 1][j - 1] == -3) {
                    map[i][j] = "D ";
                }
            }
        }
        print();
    }

    void paintCloseField(Field field) {
        for (int i = 1; i < map.length; i++) {
            for (int j = 1; j < map[i].length - 1; j++) {
                if (field.map[i - 1][j - 1] >= 0) {
                    map[i][j] = "~ ";
                } else if (field.map[i - 1][j - 1] == -1) {
                    map[i][j] = "* ";
                } else if (field.map[i - 1][j - 1] == -2) {
                    map[i][j] = "x ";
                } else if (field.map[i - 1][j - 1] == -3) {
                    map[i][j] = "X ";
                }
            }
        }
        print();
    }

    void print() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
