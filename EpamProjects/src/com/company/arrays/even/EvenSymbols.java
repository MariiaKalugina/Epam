package com.company.arrays.even;

public class EvenSymbols {
    private char[][] matrix;

    public EvenSymbols(char[][] matrix) {
        this.matrix = matrix;
    }

    public void printEvenItems(){
        if(isEmpty()){
            throw new IllegalArgumentException("Array is empty!");
        }
        printInputMatrix();
        System.out.println("Event item of matrix:");
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(j % 2 != 0) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    public void printOddItems(){
        if(isEmpty()){
            throw new IllegalArgumentException("Array is empty!");
        }
        printInputMatrix();
        System.out.println("Odd item of matrix:");
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(j % 2 == 0) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    private boolean isEmpty(){
        if(matrix == null) {
            return true;
        }
        return false;
    }
    private void printInputMatrix(){
        System.out.println("Input matrix:");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

}
