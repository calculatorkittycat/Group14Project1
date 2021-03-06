package HomeWorkColab.carpet;
//HI IGOR!!!
public class persianCarpetTask {

    public int width;
    public int length;
    public double unitPrice;
    public boolean isPersian;

    public void setInfo(int width, int length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost() {
        if (isPersian == true) {
            double calcCost = 200 + ((width * length) * unitPrice);
            System.out.println("carpet is persian, so thats why is expensive: " + calcCost);
            return calcCost;
        } else {
            double calcCost = (width * length) * unitPrice;
            System.out.println("based on carpet dimensions, the price is " + calcCost);
            return calcCost;
        }
    }

    public String toString() {
        return "persianCarpetTask{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                '}';
    }
    /*
 Carpet Task:
    	create a custom class for the Carpet class that should contain the following:

                instance variables:
                        width, length, unitPrice, isPersian (boolean)

                instance methods:
                        customOrder(): sets the carpet' width, length, unitprice, & isParsian
                        calcCost(): should be able to caculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()


            total price of carpet = (width*length)*unitprice

            if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice

        create a class called carpetObjects, and create an array of the carpet that contains 5 carpet objects ( make sure you set the instance variables of those objets)
            create two ArrayList of carpets:
                                        persianCarpets
                                        reugularCarpets
        write a program to store all the persian Carpets into the list of persianCarpets, and store all regular carpets into the list of reugularCarpets

                    use for each loop to print out all the persian carpets
 */

}
