package CandyTask;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {

    public static void main(String[] args) {


        Candy candy1 = new Candy("Hershey", 0, 0, false);
        Candy candy2 = new Candy("Peanut M&Ms", 2, 2.50, true);
        Candy candy3 = new Candy("Skittles", 7, 1.89, false);
        Candy candy4 = new Candy("Baby Ruth", 6, 1.50, true);
        Candy candy5 = new Candy("Kit-Kat", 2, 1.60, false);

        ArrayList<Candy> list = new ArrayList<>();
        list.addAll(Arrays.asList(candy1,candy2,candy3,candy4,candy5));

        System.out.println(list);

        for (Candy eachCandy : list) {
            System.out.println(eachCandy.getBrand());
            System.out.println(eachCandy.getPrice());
        }

    }



}
/*
Create a class named CandyFactory
            Create an ArrayList of candies
            Add five objects of candies
            use for each loop to print the brand and price of each candy
*/

