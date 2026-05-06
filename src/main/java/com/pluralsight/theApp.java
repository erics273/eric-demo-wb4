package com.pluralsight;

public class theApp {
    public static void main(String[] args) {

        //create a person
        Person loviIsTheMan = new Person("Lovi", "Tesfay", 35, 30.00, 100);

        //use concatenation to print out the first and last name
        System.out.println(loviIsTheMan.getFirstName() + " " + loviIsTheMan.getLastName());

        System.out.println(loviIsTheMan.getFullName());

        System.out.println(loviIsTheMan.getHoursWorked());
        System.out.println(loviIsTheMan.getPayRate());

        System.out.println("total pay was:" + loviIsTheMan.getHoursWorked() * loviIsTheMan.getPayRate());

        System.out.println(loviIsTheMan.whatDoIMake());

        if(loviIsTheMan.isOld()){
            System.out.println("get this man a seat");
        }else{
            System.out.println("keep walking");
        }


    }

}
