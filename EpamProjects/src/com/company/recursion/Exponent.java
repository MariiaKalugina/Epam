/**
 * 10.42 Write a method for exponentiation n to exponent a.
 */
package com.company.recursion;

public class Exponent {
    public float getExponent(float n, int exp) {
        if (exp < 0 || n <= 0) {
            throw new IllegalArgumentException("Exponent and number must be positive!");
        }
        if (exp == 0) {
            return 1;
        }
        if (exp == 1) {
            return n;
        }
        return n * getExponent(n, exp - 1);
    }
}
