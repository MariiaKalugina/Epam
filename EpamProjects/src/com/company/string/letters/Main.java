/*
 * Output third, last and k letters from word and swap second and fifth letter in word.
 */
package com.company.string.letters;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Letter someLetterToOutput = new Letter();
        System.out.print("Введите слово: ");
        Scanner inputWord = new Scanner(System.in);
        String word = inputWord.next();
        // 9.13
        System.out.println(someLetterToOutput.getLetter(word,2));
        // 9.14
        System.out.println(someLetterToOutput.getLetter(word,word.length() - 1));
        System.out.print("Введите значение k: ");
        Scanner inputK = new Scanner(System.in);
        int k = 0;
        try {
            k = inputK.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Нельзя вводить буквы");
        }
        // 9.15
        System.out.println(someLetterToOutput.getLetter(word,k - 1));
        // 9.100
        Swap swapLetters = new Swap();
        System.out.println("Поменять местами 2 и 5 буквы: ");
        System.out.println(swapLetters.changeLetters(word));
    }
}