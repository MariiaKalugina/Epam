/**
 * Test class for operates with bank account with treads.
 */
package com.epam.bank;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetMoneyAbilityTest {

    @Test
    public void getMoneyBehavior() {
        GetMoneyAbility ability = new GetMoneyAbility();
        assertEquals(50, ability.getMoneyBehavior(100, 50));
        assertEquals(340, ability.getMoneyBehavior(500, 160));
    }
}