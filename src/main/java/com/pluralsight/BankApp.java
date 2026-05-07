package com.pluralsight;

public class BankApp {

    public static void main(String[] args) {

        //access the interest rate without an instance of the class
        System.out.println(BankAccount.getInterestRate());

        //update the static property using a static method that is shared accross bank accounts
       // BankAccount.setInterestRate(4.0);

        System.out.println(BankAccount.getInterestRate());

        BankAccount acct1 = new BankAccount("109","Bob", 745.00);
        BankAccount acct2 = new BankAccount("45","Susan", 1000.00);

        System.out.println("balance for account 1: " + acct1.getBalance());
        System.out.println("balance for account 2: " + acct2.getBalance());

        System.out.println("interest rate for account 1: " + acct1.showInterestRate());
        System.out.println("interest rate for account 2: " + acct2.showInterestRate());

    }
}
