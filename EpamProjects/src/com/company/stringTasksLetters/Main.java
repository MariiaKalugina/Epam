/*
 * Output third, last and k letters from word and swap second and fifth letter in word.
 */
package com.company.stringTasksLetters;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите слово: ");
        Scanner inWord = new Scanner(System.in);
        String word = inWord.next();
        if (word.length() < 3) {
            throw new StringIndexOutOfBoundsException("Слово должно состоять из трех и более букв!");
        }
        getLetter(word, 2);                                  // 9.13
        getLetter(word, word.length() - 1);                    // 9.14
        System.out.print("Введите значение k: ");
        Scanner inK = new Scanner(System.in);
        int k = 0;
        try {
            k = inK.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Нельзя вводить буквы");
        }
        getLetter(word, k - 1);                                // 9.15
        System.out.println("Поменять местами 2 и 5 буквы: ");
        System.out.println(changeLetters(word));                // 9.100

    }

    static void getLetter(String word, int k) {
        char[] charWord = word.toCharArray();
        System.out.println(new String(charWord, k, 1));
    }

    static char[] changeLetters(String word) {
        char[] charWord = word.toCharArray();
        char temp = charWord[1];
        charWord[1] = charWord[4];
        charWord[4] = temp;
        return charWord;
    }
}