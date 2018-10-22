/**
 * Test
 * 10.41 Calculate factorial of real number n.
 */
package com.company.recursion;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorial() {
        Factorial testFactorial = new Factorial();
        testFactorial.getFactorial(-4);
        assertEquals(720,testFactorial.getFactorial(6));
    }
}