/**
 * Task 12.270
 * Find corner symbols in two-dimensional array.
 */
package com.company.arrays.corner;

public class Main {
    public static void main(String[] args) {
        char[][] array = {{'a'}, {'b'}};
        SymbolsInCorners example = new SymbolsInCorners();
        System.out.println("The corner values are " + example.getFourSymbols(array));
    }
}
