/**
 * 10.41 Calculate factorial of real number n.
 */
package com.company.recursion;

public class Factorial {
    public int getFactorial(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("N must be positive!");
        }
        if (n == 1) {
            return 1;
        }
        return getFactorial(n - 1) * n;
    }
}
