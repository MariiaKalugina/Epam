/**
 * Test
 * 10.43a Calculate the sum of numeral in real number.
 * 10.43b Calculate the amount of numeral in real number.
 */
package com.company.recursion;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfNumeralTest {
    SumOfNumeral testSum = new SumOfNumeral();

    @Test(expected = IllegalArgumentException.class)
    public void getSumOfNumeral() {
        testSum.getSumOfNumeral(-2);
        assertEquals(0, testSum.getSumOfNumeral(0));
        assertEquals(9,testSum.getSumOfNumeral(45));
    }

    @Test(expected = IllegalArgumentException.class)
    public void getAmountOfNumeral() {
        testSum.getAmountOfNumeral(-3);
        assertEquals(1, testSum.getAmountOfNumeral(0));
        assertEquals(45678, testSum.getAmountOfNumeral(5));
    }
}