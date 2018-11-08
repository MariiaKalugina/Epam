package com.company.arrays.certain.symbols;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordInArrayTest {
    char[][] arrayOfSymbols = {{'a', 'b', 'c', 'e'}, {'v', 'd', 's'}, {'f'}};
    char[][] arrayOfSymbols2 = {{'c', 'e'}, {'y', 'd', 's'}, {'f', 'w'}};
    char[][] arrayOfSymbolsNull;

    WordInArray array = new WordInArray();

    @Test(expected = IllegalArgumentException.class)
    public void testGetSymbolsFromArrayWithException() {
        array.getSymbolsFromArray(arrayOfSymbols, 0, 0, 1);
        array.getSymbolsFromArray(arrayOfSymbols, -1, 0, 1);
        array.getSymbolsFromArray(arrayOfSymbolsNull, 0, 0, 1);
    }

    @Test
    public void testGetSymbolsFromArray1() {
        assertEquals("s", array.getSymbolsFromArray(arrayOfSymbols2, 2, 3, 3));
        assertEquals("vds", array.getSymbolsFromArray(arrayOfSymbols, 2, 1, 3));
    }
}