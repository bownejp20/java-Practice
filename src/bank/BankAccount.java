package bank;

public class BankAccount {
    int accountNumber ;
    String accountHolder ;
    double balance;
    boolean bankMember;
public BankAccount(int accountNumber, String accountHolder, double balance){
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    this.balance = balance;
}
    public int getAccountNumber() {
        return this.accountNumber;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountHolder() {
        return this.accountHolder;
    }
    public void setAccountHolder(String accountHolder){
    this.accountHolder = accountHolder;
    }
    public double getAccountBalance() {
        return this.balance;
    }
    public void setBalance(double balance){
    this.balance = balance;
    }
    public void printAcctDetails() {
        System.out.println(accountNumber + " " + accountHolder + " " + balance);
    }

}
