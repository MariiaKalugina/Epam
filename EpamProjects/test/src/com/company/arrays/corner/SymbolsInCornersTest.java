package com.company.arrays.corner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SymbolsInCornersTest {

    @Test
    public void testGetFourSymbols() {
        char[][] array = {{'a'}, {'b'}};
        SymbolsInCorners symbols = new SymbolsInCorners();
        assertEquals("a b ", symbols.getFourSymbols(array));
    }
}