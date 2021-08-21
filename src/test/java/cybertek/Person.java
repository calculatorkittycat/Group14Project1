package cybertek;

import java.time.LocalDate;

public class Person {

    private String name;
    private final char gender;
    private final int age;
    private final LocalDate dOb;

    public Person(String name, char gender, int age, LocalDate dOb) {
        setName(name);
        this.gender = gender;
        this.dOb = dOb;
        this.age = LocalDate.now().getYear() - this.dOb.getYear();

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

    public LocalDate getdOb() {
        return dOb;
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    public void sleep(String drink){
        System.out.println(name + " is sleeping" + drink);
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dOb=" + dOb;
    }
}
