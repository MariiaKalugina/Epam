/**
 * Interface for ability to choose implementation for get money.
 */
package com.epam.bank;

public interface GetMoneyBehavior {
    int getMoneyBehavior(int account, int amount);
}
