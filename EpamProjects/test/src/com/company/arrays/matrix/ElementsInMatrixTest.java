package com.company.arrays.matrix;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElementsInMatrixTest {
    char[][] matrix =
            {{'a', 'b', 'c', 'd', 'e'},
                    {'f', 'g', 'h', 'i', 'j'},
                    {'k', 'l', 'm', 'n', 'o'},
                    {'p', 'q', 'r', 's', 't'},
                    {'w', 'x', 'y', 'z', '!'}};
    char[][] matrixWrongLength =
            {{'a', 'b', 'c', 'd', 'e'},
                    {'f', 'g', 'h', 'i', 'j'}};
    ElementsInMatrix elementsInMatrix = new ElementsInMatrix();

    @Test(expected = IllegalArgumentException.class)
    public void testGetElementsFromLeftToRight() {
        elementsInMatrix.getElementsFromLeftToRight(matrixWrongLength);
        assertEquals("ace gi kmo qs wy! ", elementsInMatrix.getElementsFromLeftToRight(matrix));
    }

    @Test
    public void testGetElementsFromUpToDown() {
        assertEquals("akw gq cmy is eo! ", elementsInMatrix.getElementsFromUpToDown(matrix));
    }
}