package HomeWorkColab.employeeTask;

public class Employee {
    public String name;
    public char gender;
    public int id;
    public String jobTitle;
    public double salary;

    public void setInfo(String name, char gender, int id, String jobTitle, double salary) {
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Employee: \n" +
                "name = '" + name + '\'' +
                " \ngender = " + gender +
                " \nid = " + id +
                " \njobTitle = '" + jobTitle + '\'' +
                " \nsalary = " + salary ;
    }
}
