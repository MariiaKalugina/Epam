package com.company.arrays.even;

public class Main {
    public static void main(String[] args) {
        char[][] matrix = {{'a', 'b', 'c', 'd', 'e'},
                {'f', 'g', 'h', 'i', 'j'},
                {'k', 'l', 'm', 'n', 'o'},
                {'p', 'q', 'r', 's', 't'},
                {'w', 'x', 'y', 'z', '!'}};
        EvenSymbols es = new EvenSymbols(matrix);
        es.printEvenItems();
        System.out.println();
        es.printOddItems();
    }
}
