/**
 * The class divides input array in two halves, calls itself for the two halves and then merges the two sorted halves.
 * The mergeSort() function is used for merging two halves.
 */
package com.epam.search;

public class MergeSort {
    private int[] inputArray;
    private int[] helperArray;

    void sort(int[] inputArray) {
        this.inputArray = inputArray;
        this.helperArray = new int[inputArray.length];
        mergeSort(0, inputArray.length - 1);
    }

    private void mergeSort(int lowerBoundary, int higherBoundary) {
        if (lowerBoundary < higherBoundary) {
            int middleBoundary = lowerBoundary + (higherBoundary - lowerBoundary) / 2;
            mergeSort(lowerBoundary, middleBoundary);
            mergeSort(middleBoundary + 1, higherBoundary);
            merge(lowerBoundary, middleBoundary, higherBoundary);
        }
    }

    private void merge(int lowerBoundary, int middleBoundary, int higherBoundary) {
        for (int i = lowerBoundary; i <= higherBoundary; i++) {
            this.helperArray[i] = this.inputArray[i];
        }
        int i = lowerBoundary;
        int j = middleBoundary + 1;
        int k = lowerBoundary;
        while (i <= middleBoundary && j <= higherBoundary) {
            if (this.helperArray[i] <= this.helperArray[j]) {
                this.inputArray[k] = this.helperArray[i];
                i++;
            } else {
                this.inputArray[k] = this.helperArray[j];
                j++;
            }
            k++;
        }
        while (i <= middleBoundary) {
            this.inputArray[k] = this.helperArray[i];
            k++;
            i++;
        }
    }
}
