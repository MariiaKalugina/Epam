/**
 *  Main class for:
 *  Binary Search
 *  Bubble Sort
 *  Merge Sort
 *  Radix Sort
 *  Quick Sort
 */
package com.epam.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        initialize();
    }

    private static void initialize() {
        //BinarySearch
        int[] arrayForBinary = {1, 2, 3, 4, 5};
        System.out.print("Input element to find: ");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int count = 0;
            try {
                count = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            BinarySearch binarySearch = new BinarySearch();
            System.out.println("Binary Search: " + binarySearch.binarySearch(count, arrayForBinary));
        } catch (IOException e) {
            e.printStackTrace();
        }
        int[] arrayForBubbleSort = {44, 3, 22, 46, 4, 1, 8, 7, -7, 11};
        int[] arrayForMergeSort = {44, 3, 22, 46, 4, 1, 8, 7, -7, 11};
        int[] arrayForRadixSort = {44, 3, 22, 46, 4, 1, 8, 7, 7, 11};
        int[] arrayForQuickSort = {44, 3, 22, 46, 4, 1, 8, 7, 7, 11};
        //BubbleSort
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arrayForBubbleSort);
        System.out.println("Bubble Sort:" + Arrays.toString(arrayForBubbleSort));
        //MergeSort
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arrayForMergeSort);
        System.out.println("Merge Sort: " + Arrays.toString(arrayForMergeSort));
        //RadixSort
        RadixSort radixSort = new RadixSort();
        radixSort.sort(arrayForRadixSort);
        System.out.println("Radix Sort: " + Arrays.toString(arrayForRadixSort));
        //QuickSort
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arrayForQuickSort, 0, arrayForQuickSort.length - 1);
        System.out.println("QuickSort: " + Arrays.toString(arrayForQuickSort));
    }
}
