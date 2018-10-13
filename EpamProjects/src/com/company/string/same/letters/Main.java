/*
 * Output the number of same near letters in sentence.
 */
package com.company.string.same.letters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SameNearLetters letters = new SameNearLetters();
        Scanner inSentence = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String sentence = inSentence.nextLine();
        char[] charSentence = sentence.toCharArray();

        System.out.println("Количество одинаковых соседних букв в предложении: "
                + letters.getSameLettersInSentence(charSentence));
    }
}
