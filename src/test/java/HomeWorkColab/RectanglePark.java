package HomeWorkColab;//Ivan
import HomeWorkColab.Rectangle;

import java.util.Scanner;

public class RectanglePark {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two integers that represent length and width");
        Rectangle rect = new Rectangle();
        rect.setInfo(scan.nextInt(), scan.nextInt());

       // rect.calculateArea();
       // rect.calculatePerimeter();

        //Make Function that:
        //if rWidth and rLength are equal then s.out square


        rect.getInfo();
    }
}
