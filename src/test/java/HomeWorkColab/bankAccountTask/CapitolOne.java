package HomeWorkColab.bankAccountTask;

import java.util.Scanner;

public class CapitolOne {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Ivan Cain",321456);

        System.out.println("Hello");
        System.out.println("Your balance is");
        System.out.println(account1.balance);

        System.out.println();
        System.out.println("Withdrawing 500$");
        account1.withdraw(500);
        System.out.println();
        System.out.println();

        System.out.println("Adding 600$");
        account1.deposit(600);
        System.out.println();
        System.out.println();
        account1.deposit(9000);
        System.out.println();
        System.out.println();
        account1.withdraw(9601);
        System.out.println(account1.balance);
        System.out.println();
        System.out.println();
        account1.withdraw(99);
        System.out.println(account1.balance);



    }
}
