package com.pluralsight;

public class BankAccount {

    private static double interestRate = 9;

    //these instance variables
    private String number;
    private String name;
    private double balance;

    //constructor
    public BankAccount(String number, String name, double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    //methods the class
    public double deposit(double amount) {
        return this.balance += amount;
    }

    public static double getInterestRate() {
        return interestRate;
    }
    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public double withdraw(double amount) {
        return this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public double showInterestRate(){
        return interestRate;
    }


}
