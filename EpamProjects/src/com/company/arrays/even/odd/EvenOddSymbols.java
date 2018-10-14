package com.company.arrays.even.odd;

public class EvenOddSymbols {
    private char[][] matrix;

    public EvenOddSymbols(char[][] matrix) {
        this.matrix = matrix;
    }

    public String getEvenItems() {
        String result = "";
        if (isEmpty()) {
            throw new IllegalArgumentException("Array is empty!");
        }
        printInputMatrix();
        System.out.println("Event item of matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j % 2 != 0) {
                    result += matrix[i][j];
                }
            }
            result += " ";
        }
        return result;
    }

    public String getOddItems() {
        String result = "";
        if (isEmpty()) {
            throw new IllegalArgumentException("Array is empty!");
        }
        System.out.println("Odd item of matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j % 2 == 0) {
                    result += matrix[i][j];
                }
            }
            result += " ";
        }
        return result;
    }

    private boolean isEmpty() {
        if (matrix == null) {
            return true;
        }
        return false;
    }

    private void printInputMatrix() {
        System.out.println("Input matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
