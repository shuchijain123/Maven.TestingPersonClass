package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    private String ethnicity;
    private String address;
    private int height;
    private int kids;

    public Person() {
        this.name ="";
        this.age = Integer.MAX_VALUE;
        this.ethnicity = "Asian";
        this.gender = "Female";
        this.address = "880 powder mill";
        this.height=5;




    }

    public Person(int age) {
        this.age = age;

    }

    public Person(String name) {

this.name =name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age =age;

    }
    public Person (String name, String address, int kids)
    {
        this.name =name;
        this.address =address;
        this.kids=kids;
    }

    public Person (String name, String ethnicity, String gender)
    {
        this.name =name;
        this.ethnicity =ethnicity;
        this.gender=gender;
    }

    public void setName(String name) {

this.name = name;
    }

    public void setAge(int age) {


this.age =age;
    }

    public void setAddress(String address) {



        this.address=address;
    }

    public void setEthnicity(String ethnicity) {



        this.ethnicity=ethnicity;
    }

    public void setHeight( int height) {



        this.height=height;
    }
    public void setGender( String  gender) {



        this.gender=gender;
    }

    public String getName() {

        return name;
    }


    public Integer getAge() {

        return age;
    }

    public Integer getHeight() {

        return height;
    }

    public String getGender() {

        return gender;
    }
    public String getEthnicity() {

        return ethnicity;
    }
    public String getAddress() {

        return address;
    }
    public int getKids() {

        return kids;
    }
}
