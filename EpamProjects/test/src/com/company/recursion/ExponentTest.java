/**
 * Test
 * 10.42 Write a method for exponentiation n to exponent a.
 */
package com.company.recursion;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExponentTest {

    @Test(expected = IllegalArgumentException.class)
    public void testGetExponent() {
        Exponent testExponent = new Exponent();
        testExponent.getExponent(-4, 2);
        assertEquals(16, testExponent.getExponent(4, 2), 0.001);
        assertEquals(1845.281, testExponent.getExponent(4.5f, 5), 0.001);
    }
}