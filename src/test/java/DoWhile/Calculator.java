package DoWhile;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//declaring a new scanner object
        double num1; // int variable with no value
        double num2;
        char operator; //char variable with no value;
        String answer = ""; //String object with empty string

        while (!answer.equals("no")) {//while the answer is not no//everything below this line happens only if answer is yes.
            System.out.println("Enter two numbers");//S
            num1 = scan.nextInt();// num1 will equal whatever the next user input number (int) is
            num2 = scan.nextInt();//same for num 2

            System.out.println("Enter a math operator");
            operator = scan.next().charAt(0);//operator is assigned to the next user input, assigns it to a char !!!Or gets the first char???

            if (operator == '-') {
                System.out.println("Subtraction " + (num1 - num2));//if user enters minus print subtraction and subtract num1 from num2
            } else if (operator == '+') {//if something else and that happens to be + then do addition
                System.out.println("Addition " + num1 + num2);//etc
            } else if (operator == '*') {
                System.out.println("Multiplication " + num1 * num2);
            } else if (operator == '/') {
                System.out.println("Division " + num1 / num2);
            } else {//if something besides + - * / then SysOut invalid
                System.out.println("Invalid Operator");
            }

            System.out.println("Do you want to continue?");
            answer = scan.next().toLowerCase();

            while( !(answer.equals("yes") || answer.equals("no"))) {//Nested while Loop// if user enters something other than yes or no
                System.out.println("Invalid Entry, Please Re-Enter");//invalid entry
                System.out.println("Do you want to continue?");
                answer = scan.next().toLowerCase();
            }


        }
    }
}
