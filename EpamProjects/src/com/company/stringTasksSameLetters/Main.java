/*
 * Output the number of same letters in sentence.
 */
package com.company.stringTasksSameLetters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inSentence = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String sentence = inSentence.nextLine();
        char[] charSentence = sentence.toCharArray();
        int count = 0;
        char letter = ' ';
        for (int i = 0; i < charSentence.length - 1; i++) {
            if (charSentence[i] == charSentence[i + 1]) {
                count++;
                if (charSentence[i] != letter) {
                    count++;
                    letter = charSentence[i];
                }
            }
        }
        System.out.println("Количество одинаковых соседних букв в предложении: " + count);  // 9.64
    }
}
