package com.company.arrays.corner;

public class SymbolsInCorners {
    public String getFourSymbols(char array[][]) {
        String result = "";
        if (array == null) {
            throw new IllegalArgumentException("Array must not be null!");
        }
        if (array[0].length == 1) {
            result = result + array[0][0] + " ";
        } else {
            result = result + array[0][0] + " " + array[0][array[0].length - 1] + " ";
        }
        if (array.length == 1) {
            return result;
        }
        if (array[array.length - 1].length == 1) {
            result = result + array[array.length - 1][0] + " ";
        } else {
            result = result + array[array.length - 1][0] + " "
                    + array[array.length - 1][array[array.length - 1].length - 1];
        }
        return result;
    }
}
