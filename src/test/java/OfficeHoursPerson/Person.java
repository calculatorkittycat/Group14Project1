package OfficeHoursPerson;

import java.time.LocalDate;

public class Person {

    private String name;
    private final char gender;
    private final int age;
    private final LocalDate dOb;

    public Person(String name, char gender,  LocalDate dOb) {
        setName(name);
        this.gender = gender;
        this.dOb = dOb;
        age= LocalDate.now().getYear() - dOb.getYear();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDoB() {
        return dOb;
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking" + drink);
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dOb=" + dOb +
                '}';
    }
}
//1. create a class named Person
//		        variables: name, gender, age, dateOfBirth
//		        methods: eat(), sleep(), drink()