package CandyTask;

public class Candy {

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity <= 0){
            return;
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0){
            return;
        }
        if(price == 0){
            System.out.println("Free!");
        }
        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}



/*
CandiesTask
     create a custom class named Candy
            private variables:
                brand (String), quantity (int), price (double), hasPeanuts (boolean)

            Encapsulate All the private fidlds
                    (price of candy can not be set to negative)
                    (quantity of candy can not be set to zero or negative)

            Add a constructor that can set the instances when the object is created
                    (avoid any duplicated code fragments)

            Extra methods:
                toString():
                    if the price is zero, print "free" instead of 0

    Create a class named CandyFactory
            Create an ArrayList of candies
            Add five objects of candies
            use for each loop to print the brand and price of each candy

SquareTask:
    1. create a class named Square
            private variables:
                side (double)

            Encapsulate All the private fields
                (side can not be set to negative)

            Add a constructor that can set the instances when the object is created
                (avoid any duplicated code fragments)

            Extra methods:
                area(), perimeter(), toString(), equals()

 */