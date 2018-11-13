/**
 * In bubble sort algorithm, array is traversed from first element to last element.
 * Here, current element is compared with the next element.
 * If current element is greater than the next element, it is swapped.
 */
package com.epam.search;

public class BubbleSort {
    void sort(int[] inputArray) {
        while (true) {
            boolean isSwapped = false;
            for (int i = 0; i < inputArray.length - 1; i++) {
                if (inputArray[i] > inputArray[i + 1]) {
                    int elementToSwap = inputArray[i + 1];
                    inputArray[i + 1] = inputArray[i];
                    inputArray[i] = elementToSwap;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                return;
            }
        }
    }
}
