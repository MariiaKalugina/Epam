/**
 * Implementation of ATM with ability of get and put money.
 */
package com.epam.bank;

public class ATMReal extends ATM {

    public ATMReal(int account) {
        this.account = account;
        getMoney = new GetMoneyAbility();
    }

    void putMoney(int amount) {
        synchronized (this) {
            this.account += amount;
            System.err.println("Put money. New amount: " + account);
        }
    }
}
