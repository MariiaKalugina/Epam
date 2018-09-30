/*
 * Swap letters in sentence and output result.
 */
package com.company.stringSwapLetters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите предложение: ");
        Scanner inSentence = new Scanner(System.in);
        String sentence = inSentence.nextLine();
        char[] charSentence = sentence.toCharArray();
        for (int i = 0; i < charSentence.length / 2; i++) {
            char temp = charSentence[i];
            charSentence[i] = charSentence[charSentence.length - 1 - i];
            charSentence[charSentence.length - 1 - i] = temp;
        }
        System.out.println(charSentence);
    }
}
