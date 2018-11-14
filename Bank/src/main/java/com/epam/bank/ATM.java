/**
 * Interface for ATM.
 */
package com.epam.bank;

public abstract class ATM {
    int account;
    GetMoneyBehavior getMoney;

    public void performGet(int amount) {
        account = getMoney.getMoneyBehavior(account, amount);
    }

    abstract void putMoney(int amount);
}
