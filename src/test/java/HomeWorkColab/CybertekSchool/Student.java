package HomeWorkColab.CybertekSchool;

import java.time.LocalDate;

public class Student {

    public String name;
    public char gender;
    public LocalDate DOB;
    public int studentId;
    public char grade;

    public void setInfo(String name, char gender, LocalDate DOB, int studentId, char grade) {
        this.name = name;
        this.gender = gender;
        this.DOB = DOB;
        this.studentId = studentId;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", DOB=" + DOB +
                ", studentId=" + studentId +
                ", grade=" + grade +
                '}';
    }
}

/*
1. Create a class named student that has the following features:
Attributes:
name, gender, DOB, age, StudentID, grade

Methods:
setInfo(): sets all the attributes of the student object
toString(): returns the full info of student Object
 */