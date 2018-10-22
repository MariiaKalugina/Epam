package com.company.arrays.even.odd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvenOddSymbolsTest {
    char[][] matrix = {{'a', 'b', 'c', 'd', 'e'},
            {'f', 'g', 'h', 'i', 'j'},
            {'k', 'l', 'm', 'n', 'o'},
            {'p', 'q', 'r', 's', 't'},
            {'w', 'x', 'y', 'z', '!'}};
    EvenOddSymbols evenOdd = new EvenOddSymbols(matrix);

    @Test
    public void testGetEvenItems() {
        assertEquals("bd gi ln qs xz ", evenOdd.getEvenItems());
    }

    @Test
    public void testGetOddItems() {
        assertEquals("akw blx cmy dnz eo! ", evenOdd.getOddItems());
    }
}