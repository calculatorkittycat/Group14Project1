package HomeWorkColab.salaryTask;

public class salary {

    public int hourlyRate, weeklyHours;
    public double stateTaxRate, federalTaxRate;

    public void setInfo(int hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }

    public double salary(){
        double salary = hourlyRate*weeklyHours*52;
        System.out.println("The salary before tax is: " +salary);
        return salary;
    }

    public double stateTax() {
        if (stateTaxRate <= 0 || stateTaxRate >= 1) {
            System.out.println("Invalid state tax rate");
            return stateTaxRate;
        } else {
            double stateTax = (hourlyRate * weeklyHours * 52) * stateTaxRate;
            System.out.println("State tax: " + stateTax);
            return stateTax;
        }
    }

    public double federalTax() {
        if (federalTaxRate <= 0 || federalTaxRate >= 1) {
            System.out.println("Invalid federal tax rate");
            return federalTaxRate;
        } else {
            double federalTax = (hourlyRate * weeklyHours * 52) * federalTaxRate;
            System.out.println("Federal tax: " + federalTax);
            return federalTax;
        }
    }

    public double salaryAfterTax(){
        double salaryAfterTax = salary() - (stateTax()+federalTax());
        System.out.println(salaryAfterTax);
        return salaryAfterTax;
    }

    public String toString() {
        return "salary{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHours=" + weeklyHours +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                '}';
    }
}
/*
SalaryCalculator
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

        Actions:
            setInfo(): sets all the fields of SalaryCalculator
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
            stateTax(): claculates the totalstateTax
            federalTax(): calculates the total federal tax
            salaryAfterTax(): calculates the salary after tax
            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */
