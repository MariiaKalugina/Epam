/**
 * Main class for operates with bank account with treads.
 */
package com.epam.bank;

public class Main {
    public static void main(String[] args) {
        ATM atmReal = new ATMReal(50);
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("Mikki");
                atmReal.performGet(50);
                atmReal.putMoney(50);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("Leopold");
                atmReal.performGet(50);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.err.println("Make");
                atmReal.performGet(50);
            }
        }).start();
    }
}
