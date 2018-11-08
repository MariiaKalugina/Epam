package com.company.arrays.corner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SymbolsInCornersTest {
    char[][] array = {{'a'}, {'b'}};
    char[][] arrayNull;
    char[][] array2 = {{'a', 'v', 's'}, {'b', 'e', 'q', 'x'}, {'d', 'e'}};

    @Test
    public void testGetFourSymbols() {
        SymbolsInCorners symbols = new SymbolsInCorners();
        assertEquals("a b ", symbols.getFourSymbols(array));
        assertEquals("a s d e", symbols.getFourSymbols(array2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetFourSymbolsWithException() {
        SymbolsInCorners symbols = new SymbolsInCorners();
        symbols.getFourSymbols(arrayNull);
    }
}