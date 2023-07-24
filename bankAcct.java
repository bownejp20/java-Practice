package bank;

public class BankAccount {
    int accountNumber = 102564821;
    String accountHolder = "Jessica";
    double balance = 1520.63;

    public int getAccountNumber() {
        return this.accountNumber;
    }
    public String getAccountHolder() {
        return this.accountHolder;
    }
    public double getAccountBalance() {
        return this.balance;
    }
    public void printAcctDetails() {
        System.out.println(Integer.toString(accountNumber) + " " + accountHolder + " " + Integer.toString((int) balance));
    }
}