package Abstraction;

public class School {
    public static void main(String[] args) {
        //Student student = new Student();//Doesn't Work!!!
        OnlineStudent onlineStudent = new OnlineStudent();
        onlineStudent.attendClass();

        CampusStudent campusStudent = new CampusStudent();
        campusStudent.attendClass();
    }
}
