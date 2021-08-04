package HomeWorkColab.scrumHomework;



public class Tester {
//comment
    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;


    public void setInfo(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void smokeTesting(){
        System.out.println(name + "is smoke Testing");
    }

    public void creatingTitcket(){
        System.out.println(name + "is creating a ticket");
    }

    public void dailyStandUp(){
        System.out.println(name + " is in their daily stand up meeting");
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }//
}

/*
 create a class called Tester
        Attributes:
            name, employeeID, JobTitle, Salary
        Actions:
           setInfo(), smokeTesting(),  creatingTicket(), dailyStandUp() toString()

create a class called Developer
          Attributes:
            name, employeeID, JobTitle, Salary
          Actions:
            setInfo(), coding(), unitTesting(), fixingBug(), toString()

create a class called ScrumTeam
           Attributes:
                String PO, BA, SM;
                ArrayList<Tester> testersList = new ArrayList<>();
                ArrayList<Developer> devopsList = new ArrayList<>();
               int daysOfSprint;

             Actions:
                  setInfo(): sets the names of PO, BA, SM
                  addTester(Tester tester): adds the given tester to the testers ArrayList

                  addTesters(Tester[] testers): adds the given testers to the testers ArrayList

                  addDeveloper(Developer developer): adds the given developer to the developers ArrayList

                  addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList
                 removeTester(long employeeID): removes the given tester from the testers ArrayList

                 removeDeveloper(long employeeID): removes the developer from the developers ArrayList

                  toString(): prints number of tester,& developers,  PO name, SM name, BA name

create a class called MyScrumTeam:
                    1. create an array of Testers and add the testers from your group
                    2. create an array of developers add the developers from your group
                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */
