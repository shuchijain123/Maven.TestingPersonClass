package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
         String expectedGender = "Female";
         String expectedEthnicity = "Asian";
         String expectedaddress = "880 powder mill";
         int expectedheight = 5;
         int expectedkids =3;


        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        int actualHeight = person.getHeight();
        String actualGender =person.getGender();
        String actualEthnicity = person.getEthnicity();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedheight, actualHeight);
        Assert.assertEquals(expectedEthnicity, actualEthnicity);
        Assert.assertEquals(expectedGender, actualGender);

    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void testConstructorWithNameEthnicityGender() {
        // Given
        String expectedGender = "Female";
        String expectedName = "Leon";
        String expectedEthnicity = "Asian";

        // When
        Person person = new Person(expectedName, expectedEthnicity,expectedGender );

        // Then
        String actualGender = person.getGender();
        String actualName = person.getName();
        String actualEthnicity = person.getEthnicity();

        Assert.assertEquals(expectedEthnicity, actualEthnicity);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedGender, actualGender);
    }

    @Test
    public void testConstructorWithNameAddressKids() {
        // Given
        String expectedadress = "880 powder mill";
        String expectedName = "Leon";
        int expectedKids = 3;

        // When
        Person person = new Person(expectedName, expectedadress,expectedKids );

        // Then
        String actualaddress = person.getAddress();
        String actualName = person.getName();
        int actualKids = person.getKids();

        Assert.assertEquals(expectedadress, actualaddress);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedKids, actualKids);
    }
    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetGender() {
        // Given
        Person person = new Person();
       String expected = "Female";

        // When
        person.setGender(expected);

        // Then
        String actual = person.getGender();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetethnicity() {
        // Given
        Person person = new Person();
        String expected = "Asian";

        // When
        person.setEthnicity(expected);

        // Then
        String actual = person.getEthnicity();
        Assert.assertEquals(expected, actual);
    }
}
