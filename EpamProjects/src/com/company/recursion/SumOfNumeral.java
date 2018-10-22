/**
 * 10.43a Calculate the sum of numeral in real number.
 * 10.43b Calculate the amount of numeral in real number.
 */
package com.company.recursion;

public class SumOfNumeral {
    public int getSumOfNumeral(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("The number must be positive!");
        } else if (number == 0) {
            return 0;
        }
        return number % 10 + getSumOfNumeral(number / 10);
    }

    public int getAmountOfNumeral(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("The number must be positive!");
        }
        if (number == 0) {
            return 1;
        }
        return getAmountOfNumeral(number / 10) + 1;
    }
}