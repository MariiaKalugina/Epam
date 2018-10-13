/**
 * Task 12.271
 * Find and output symbols in two-dimensional array 5x5.
 * a) output in order: from left to right
 * b) output in order: from up to down
 */
package com.company.arrays.matrix;

public class Main {
    public static void main(String[] args) {
        char[][] matrix =
                {{'a', 'b', 'c', 'd', 'e'},
                {'f', 'g', 'h', 'i', 'j'},
                {'k', 'l', 'm', 'n', 'o'},
                {'p', 'q', 'r', 's', 't'},
                {'w', 'x', 'y', 'z', '!'}};
        ElementsInMatrix outputArray = new ElementsInMatrix();
        System.out.println(outputArray.getElementsFromLeftToRight(matrix));
        System.out.println(outputArray.getElementsFromUpToDown(matrix));
    }
}
