package com.company.arrays.certain.symbols;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordInArrayTest {
    char[][] arrayOfSymbols = {{'a', 'b', 'c', 'e'}, {'v', 'd', 's'}, {'f'}};
    char[][] arrayOfSymbols2 = {{'c', 'e'}, {'y', 'd', 's'}, {'f', 'w'}};
    WordInArray array = new WordInArray();

    @Test(expected = IllegalArgumentException.class)
    public void testGetSymbolsFromArray() {
        array.getSymbolsFromArray(arrayOfSymbols, 0, 0, 1);
        assertEquals("s", array.getSymbolsFromArray(arrayOfSymbols2, 2, 3, 3));
    }
}