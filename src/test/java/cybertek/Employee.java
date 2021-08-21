package cybertek;

import java.time.LocalDate;

public class Employee extends Person {

    private int employeeId;
    private String jobTitle;
    private double salary;

    public Employee(String name, char gender, int age, LocalDate dOb, int employeeId, String jobTitle, double salary) {
        super(name, gender, age, dOb);// super keyword is calling the parent classes constructor
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);//using the setter you can set parameters like if less than 0 exit the method
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 0 ){
            return;
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName() + " is working.");
    }

    public void attendMeeting(){// if it was final you would not be able to over ride it later in another class
        System.out.println(getName() + " is attending a meeting.");
    }

    @Override
    public String toString() {
        return  "Employee{" +
                super.toString() +
                "employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }




}
//super. calls any method or variable that is visible from the parent class
//super() just for calling constructor from the parent class