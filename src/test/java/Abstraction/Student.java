package Abstraction;

/*
We add abstract keyword to a class to make it an abstract class
We can not create object of Student class - meaning
Student student = new Student(); will show ERROR
What can we do with this Student class? we can extend this class by sub classes
Student class will parent class for all other types of student related classes

So you can NOT create an Student object from this Abstract Student class.
But you can inherit its attributes
 */

public abstract class Student {

    public void code(String language) {
        System.out.println("Student is coding using " + language);
    }

    /*
    we can add abstract methods into abstract class
    abstract method is created using abstract keyword
    and does not have the implementation/method body
    So abstract class only shows WHAT it can do, but not HOW by using abstract methods
     */

    public abstract void attendClass();

}
