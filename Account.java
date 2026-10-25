class Account {
    private double balance = 7250.50;

    public void displayBalance() {
        System.out.println("Account balance: " + balance);
    }
}
public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.displayBalance();
    }
}
