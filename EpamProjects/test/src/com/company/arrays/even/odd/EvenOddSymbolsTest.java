package com.company.arrays.even.odd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EvenOddSymbolsTest {
    char[][] matrix = {{'a', 'b', 'c', 'd', 'e'},
            {'f', 'g', 'h', 'i', 'j'},
            {'k', 'l', 'm', 'n', 'o'},
            {'p', 'q', 'r', 's', 't'},
            {'w', 'x', 'y', 'z', '!'}};
    char[][] matrix2 = {{'a', 'b', 'c', 'd'},
            {'k', 'l', 'm', 'n'},
            {'p', 'q', 'r', 's'},
            {'w', 'x', 'y', 'z'}};
    char[][] matrixNull;
    EvenOddSymbols evenOdd = new EvenOddSymbols(matrix);
    EvenOddSymbols evenOdd2 = new EvenOddSymbols(matrix2);
    EvenOddSymbols evenOddNull = new EvenOddSymbols(matrixNull);

    @Test
    public void testGetEvenItems() {
        assertEquals("bd gi ln qs xz ", evenOdd.getEvenItems());
        assertEquals("bd ln qs xz ", evenOdd2.getEvenItems());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEvenItemsWithException() {
        evenOddNull.getEvenItems();
    }

    @Test
    public void testIsEmpty() {
        assertTrue(evenOddNull.isEmpty());
        assertFalse(evenOdd.isEmpty());
    }

    @Test
    public void testGetOddItems() {
        assertEquals("akw blx cmy dnz eo! ", evenOdd.getOddItems());
        assertEquals("ap bq cr ds ", evenOdd2.getOddItems());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetOddItemsWithException() {
        evenOddNull.getOddItems();
    }
}