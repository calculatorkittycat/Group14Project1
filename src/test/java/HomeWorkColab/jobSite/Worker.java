package HomeWorkColab.jobSite;

public class Worker {

    private final String name;
    public final static boolean hasTools, hasVan;
    public final static double gasPrice;
    public String tools;
    public boolean isContractor;                     //to make private or public all?
    public boolean isEmployee;

    static {
        hasTools = true;
        hasVan = true;
        gasPrice = 3.89;
    }

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double payRate(){
        return 0;
    }

    public int hoursPerWeek(){
        return 0;
    }

    public double milesToWork(){
        return 0;
    }






}
/*
payRate
milesToWork
hoursPerWeek
gasPrice
isContractor // If true, must pay 10000$ per year tax
isEmployee // if true must pay 11% tax per pay check

////
 */