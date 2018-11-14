/**
 * Implementation of inability to get money.
 */
package com.epam.bank;

public class GetMoneyInability implements GetMoneyBehavior {
    @Override
    public int getMoneyBehavior(int account, int amount) {
        System.out.println("ATM does not accept money!");
        return account;
    }
}
