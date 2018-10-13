package com.company.string.letters;

public class Letter {
    public String getLetter(String word, int k) {
        if (word.length() < 3) {
            throw new StringIndexOutOfBoundsException("Слово должно состоять из трех и более букв!");
        }
        char[] charWord = word.toCharArray();
        return new String(charWord, k, 1);
    }
}
