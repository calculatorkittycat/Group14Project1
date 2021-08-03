package HomeWorkColab.salaryTask;

public class MySalary {

    public static void main(String[] args) {

        salary andrei = new salary();
        andrei.setInfo(55,40,0.04,0.22);

        andrei.salary();
        andrei.stateTax();
        andrei.federalTax();
        andrei.salaryAfterTax();
        System.out.println(andrei);
    }
}

