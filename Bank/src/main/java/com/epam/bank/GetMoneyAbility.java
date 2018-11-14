/**
 * Implementation of ability to get money.
 */
package com.epam.bank;

public class GetMoneyAbility implements GetMoneyBehavior {
    @Override
    public int getMoneyBehavior(int account, int amount) {
        synchronized (this) {
            if (amount <= account) {
                account -= amount;
                System.err.println("Get money. New amount: " + account);
            } else {
                System.err.println("Not enough money!");
            }
            return account;
        }
    }
}

