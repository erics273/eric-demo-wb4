package com.pluralsight;

public class Person {


    private String firstName;
    private String lastName;

    private int hoursWorked;

    private double payRate;

    private int age;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int hoursWorked, double payRate, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    //a calculated getter
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public double getTotalPay(){
        return this.hoursWorked * this.payRate;
    }

    public String whatDoIMake(){
        return this.getFullName() + " made " + this.getTotalPay();
    }

    public boolean isOld(){
//        if(this.age > 50){
//            return true;
//        }
//
//        return false;

        return this.age > 50;
    }
}
