package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void getFullName_should_returnFirstAndLastName(){
        //arrange
        Person somePerson = new Person("eric", "schwartz");
        String expectedOutput = "eric schwartz";

        //act
        String actualOutput = somePerson.getFullName();

        //assert
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void getTotalPay_should_returnHoursWorkedTimesPayrate(){
        //arrange
        Person somePerson = new Person("Luke", "Skywalker");
        somePerson.setHoursWorked(40);
        somePerson.setPayRate(25.00);

        double expectedTotalPay = 1000;

        //act
        double actualTotalPay = somePerson.getTotalPay();

        //assert
        assertEquals(expectedTotalPay, actualTotalPay);
    }

    @Test
    public void getLastName_should_return_lastName(){
        //arrange
        Person somePerson = new Person("Bobby", "Hill");
        String expectdOutput = "Hill";

        //act
        String actualOutput = somePerson.getLastName();

        //assert
        assertEquals(expectdOutput, actualOutput);

    }

    @Test
    public void isOld_should_returnTrue_when_ageIsGreaterThan50(){
        //arrange
        Person theOldPerson = new Person("Super", "Man");
        theOldPerson.setAge(65);


        //act
        boolean actualOutput = theOldPerson.isOld();

        //assert
        assertTrue(actualOutput);

    }

    @Test
    public void isOld_should_returnFalse_when_ageIsLessThan50(){
        //arrange
        Person theOldPerson = new Person("Super", "Man");
        theOldPerson.setAge(49);


        //act
        boolean actualOutput = theOldPerson.isOld();

        //assert
        assertFalse(actualOutput);

    }


}