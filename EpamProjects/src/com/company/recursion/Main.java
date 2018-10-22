/**
 * Tasks with recursion:
 * 10.41 Calculate factorial of real number n.
 * 10.42 Write a method for exponentiation n to exponent a.
 * 10.43a Calculate the sum of numeral in real number.
 * 10.43b Calculate the amount of numeral in real number.
 */
package com.company.recursion;

public class Main {
    public static void main(String[] args) {
        print();
    }

    public static void print() {
        System.out.println("Factorial: " + new Factorial().getFactorial(10));
        System.out.println("Exponentiation: " + new Exponent().getExponent(10.0f, 2));
        System.out.println("Sum of numeral: " + new SumOfNumeral().getSumOfNumeral(4));
        System.out.println("Amount of numeral: " + new SumOfNumeral().getAmountOfNumeral(4));
    }
}
