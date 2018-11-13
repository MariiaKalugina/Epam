/**
 * The basic step of sorting an array are as follows:
 * Select a pivot, normally the middle one
 * From both ends, swap elements and make left elements < pivot and all right > pivot
 * Recursively sort left part and right part
 */
package com.epam.sorts;

public class QuickSort {
    void sort(int array[], int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, low, high);
            sort(array, low, partitionIndex - 1);
            sort(array, partitionIndex + 1, high);
        }
    }

    private int partition(int array[], int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }
}


