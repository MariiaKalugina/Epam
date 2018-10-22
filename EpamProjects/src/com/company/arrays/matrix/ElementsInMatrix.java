package com.company.arrays.matrix;

public class ElementsInMatrix {
    public String getElementsFromLeftToRight(char[][] matrix) {
        String result = "";
        if (matrix.length != 5 || isFiveElementsInLine(matrix)) {
            throw new IllegalArgumentException("Array must be 5x5 dimensional!");
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    result += matrix[i][j];
                } else if (i % 2 > 0 && j % 2 > 0) {
                    result += matrix[i][j];
                }
            }
            result += " ";
        }
        return result;
    }

    public String getElementsFromUpToDown(char[][] matrix) {
        String result = "";
        if (matrix.length != 5 || isFiveElementsInLine(matrix)) {
            throw new IllegalArgumentException("Array must be 5x5 dimensional!");
        }
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    result += matrix[i][j];
                } else if (i % 2 > 0 && j % 2 > 0) {
                    result += matrix[i][j];
                }
            }
            result += " ";
        }
        return result;
    }

    private boolean isFiveElementsInLine(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != 5) {
                return true;
            }
        }
        return false;
    }
}
