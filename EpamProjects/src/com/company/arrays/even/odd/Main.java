package com.company.arrays.even.odd;

public class Main {
    public static void main(String[] args) {
        char[][] matrix = {{'a', 'b', 'c', 'd', 'e'},
                {'f', 'g', 'h', 'i', 'j'},
                {'k', 'l', 'm', 'n', 'o'},
                {'p', 'q', 'r', 's', 't'},
                {'w', 'x', 'y', 'z', '!'}};
        EvenOddSymbols evenOddSymbols = new EvenOddSymbols(matrix);
        System.out.println(evenOddSymbols.getEvenItems());
        System.out.println(evenOddSymbols.getOddItems());
    }
}
