package OfficeHoursPerson;

import java.time.LocalDate;

public class Tester extends Employee{


    public Tester(String name, char gender, LocalDate dOb, String jobTitle, int employeeID, double salary) {
        super(name, gender, dOb, jobTitle, employeeID, salary);
    }

    @Override
    public void work(){
        System.out.println(getJobTitle() + getName() + " is working");
    }
    @Override
    public void attendMeeting(){
        System.out.println(getJobTitle() + getName() + " is in a meeting");
    }

    @Override
    public void drink(String drink) {
        System.out.println(getJobTitle() + getName() + " is drinking");
    }




}
