package com.company.string.letters;

public class Swap {
   char[] changeLetters(String word) {
        char[] charWord = word.toCharArray();
        char temp = charWord[1];
        charWord[1] = charWord[4];
        charWord[4] = temp;
        return charWord;
    }
}
