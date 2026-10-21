import java.util.Scanner;

// Abstract base class
abstract class BankAccount {
    protected int accountNumber;
    protected double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Interest is calculated differently for each account type
    public abstract double calculateInterest();

    public void display() {
        System.out.println("Account Number: " + accountNumber)
         System.out.println("Balance: " + balance);
         System.out.println('Interest: " + calculateInterest());
    }
}

// Savings account: 4% interest on the balance
class SavingsAccount extends BankAccount {
    private double interestRate = 4.0;

    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate / 100;
    }
}

// Current account: 1% interest on the balance
class CurrentAccount extends BankAccount {
    private double interestRate = 1.0;

    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate / 100;
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account type (1 = Savings, 2 = Current): ");
        int type = sc.nextInt();

        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();

        BankAccount account;
        if (type == 1) {
            account = new SavingsAccount(accNo, balance);
        } else if (type == 2) {
            account = new CurrentAccount(accNo, balance);
        } else {
            System.out.println("Invalid account type.");
            sc.close();
            return;
        }

        System.out.println();
        account.display();
        sc.close();
    }
}