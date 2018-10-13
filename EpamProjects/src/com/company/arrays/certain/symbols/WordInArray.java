package com.company.arrays.certain.symbols;

public class WordInArray {
    public String getSymbolsFromArray(char[][] arrayOfSymbols,int indexOfRow, int firstIndex, int lastIndex) {
        String result = "";
        if (arrayOfSymbols == null) {
            throw  new IllegalArgumentException("Array must not be null!");
        }
        if (indexOfRow > arrayOfSymbols.length - 1) {
            throw new IllegalArgumentException("There are not row with index " + indexOfRow);
        }
        if (firstIndex > arrayOfSymbols[indexOfRow - 1].length && lastIndex > arrayOfSymbols[indexOfRow - 1].length) {
            throw new IllegalArgumentException("There are not values with indexes from " + firstIndex + " to "
                    + lastIndex);
        }
        for (int i = firstIndex - 1; i < lastIndex - 1; i++) {
            result += arrayOfSymbols[indexOfRow - 1][i];
        }
        return result;
    }
}
