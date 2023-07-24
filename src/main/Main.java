package main;
import bank.BankAccount;

public class Main {
    public static void main(String[] args){
       BankAccount jessicaAcct = new BankAccount(124526356, "Molly", 200.00);
       jessicaAcct.setAccountNumber(24589531);
       jessicaAcct.setAccountHolder("jess");
       jessicaAcct.setBalance(1000.00);
       BankAccount mollyAcct = new BankAccount(145758956, "Jessica", 500);
       jessicaAcct.printAcctDetails();
       mollyAcct.printAcctDetails();


    }
}
