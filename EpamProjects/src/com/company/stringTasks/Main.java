/*
 * Output third, last and k letters from word.
 */
package com.company.stringTasks;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите слово: ");
        Scanner inWord = new Scanner(System.in);
        String word = inWord.next();
        char[] charWord = word.toCharArray();
        System.out.println(new String(charWord, 2, 1));                 // 9.13
        System.out.println(new String(charWord, charWord.length-1, 1)); // 9.14
        System.out.print("Введите значение k: ");
        Scanner inK = new Scanner(System.in);
        int k = inK.nextInt();
        System.out.println(new String(charWord, k-1, 1));               // 9.15
    }
}