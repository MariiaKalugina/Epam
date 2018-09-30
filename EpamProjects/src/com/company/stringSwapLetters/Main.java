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
        StringBuilder builderSentence = new StringBuilder(sentence.subSequence(0, sentence.length()));
        builderSentence.reverse();
        System.out.println(builderSentence);
    }
}
