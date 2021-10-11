package OfficeHoursPerson;

import java.time.LocalDate;

public class Student extends Person{



    private int id;
    private String schoolName;

    public Student(String name, char gender, LocalDate dOb, int id, String schoolName) {
        super(name, gender, dOb);
        setId(id);
        setSchoolName(schoolName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(getName() + " is studying"); //getName method is called from super because name is private
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "id=" + id +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
