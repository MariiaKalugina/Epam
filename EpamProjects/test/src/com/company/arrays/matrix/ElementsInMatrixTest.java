package com.company.arrays.matrix;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ElementsInMatrixTest {
    char[][] matrix =
            {{'a', 'b', 'c', 'd', 'e'},
                    {'f', 'g', 'h', 'i', 'j'},
                    {'k', 'l', 'm', 'n', 'o'},
                    {'p', 'q', 'r', 's', 't'},
                    {'w', 'x', 'y', 'z', '!'}};
    char[][] matrixWrongLength =
            {{'a', 'b', 'c', 'd'},
                    {'f', 'g', 'h', 'i', 'j'}};
    ElementsInMatrix elementsInMatrix = new ElementsInMatrix();

    @Test
    public void testGetElementsFromLeftToRight() {
        assertEquals("ace gi kmo qs wy! ", elementsInMatrix.getElementsFromLeftToRight(matrix));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsFromLeftToRightWithException() {
        elementsInMatrix.getElementsFromLeftToRight(matrixWrongLength);
    }

    @Test
    public void testGetElementsFromUpToDown() {
        assertEquals("akw gq cmy is eo! ", elementsInMatrix.getElementsFromUpToDown(matrix));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsFromUpToDownWithException() {
        elementsInMatrix.getElementsFromUpToDown(matrixWrongLength);
    }

    @Test
    public void TestIsFiveElementsInLine() {
        assertTrue(elementsInMatrix.isFiveElementsInLine(matrixWrongLength));
        assertFalse(elementsInMatrix.isFiveElementsInLine(matrix));
    }
}