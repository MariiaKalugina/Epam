/**
 * Task 12.271
 * Find sequence of symbols in array from n to m element in i row.
 */
package com.company.arrays.certain.symbols;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] arrayOfSymbols = {{'a', 'b', 'c', 'e'}, {'v', 'd', 's'}, {'f'}};
        WordInArray array = new WordInArray();
        Scanner inputParams = new Scanner(System.in);
        System.out.println("Input i (row), n (first index of necessary word) and m (last index): ");
        int i = inputParams.nextInt();
        int n = inputParams.nextInt();
        int m = inputParams.nextInt();
        System.out.println("Result: " + array.getSymbolsFromArray(arrayOfSymbols, i, n, m));
    }
}
