package HomeWorkColab.bankAccountTask;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo ( String accountHolder, long accountNumber){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    public void deposit( double amount){
        if(amount <= 0){
            System.out.println("You can not deposit zero or a negative number, try again.");
            return;
        }
        System.out.println("Your balance before deposit " + balance);
        System.out.println(+amount+ "$ was deposited into your account. "  );
        balance +=amount;
        System.out.println("Your new balance is " + balance);
    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("You can not withdraw zero or a negative number, try again.");
            return;
        }

        if (balance <= 0) {
            System.out.println("Sorry insufficient funds");
            return;
        }

        if(amount > balance){
            System.out.println("An over draft fee of 35$ has been deducted from your account");
            balance -= 35;
        }
        System.out.println("Withdrawing " + amount + " from account " + accountNumber);
        balance -= amount;
    }

    public void checkBalance(){
        System.out.println(accountHolder + " your balance is : " + balance);
    }

}
