package OfficeHoursPerson;

import java.time.LocalDate;

public class Employee extends Person {

    private String jobTitle;
    private int employeeID;
    private double salary;

    public Employee(String name, char gender, LocalDate dOb, String jobTitle, int employeeID, double salary) {
        super(name, gender, dOb);
        setJobTitle(jobTitle);
        setEmployeeID(employeeID);
        setSalary(salary);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName() + " is working");
    }

    public void attendMeeting(){
        System.out.println(getName() + " is in a meeting");
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                "jobTitle='" + jobTitle + '\'' +
                ", employeeID=" + employeeID +
                ", salary=" + salary +
                '}';
    }
}
