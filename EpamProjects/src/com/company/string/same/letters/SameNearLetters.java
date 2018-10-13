package com.company.string.same.letters;

public class SameNearLetters {
    public int getSameLettersInSentence (char[] sentence) {
        int count = 0;
        char letter = ' ';
        for (int i = 0; i < sentence.length - 1; i++) {
            if (sentence[i] == sentence[i + 1]) {
                count++;
                if (sentence[i] != letter) {
                    count++;
                    letter = sentence[i];
                }
            }
        }
        return count;
    }
}
