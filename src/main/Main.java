package main;
import bank.BankAccount;
import inventory.Inventory;
import inventory.Product;
import inventory.Warehouse;
import university.*;

public class Main {
//    public static void main(String[] args){
//       BankAccount jessicaAcct = new BankAccount(124526356, "Molly", 200.00);
//       jessicaAcct.setAccountNumber(24589531);
//       jessicaAcct.setAccountHolder("jess");
//       jessicaAcct.setBalance(1000.00);
//       BankAccount mollyAcct = new BankAccount(145758956, "Jessica", 500);
//       jessicaAcct.printAcctDetails();
//       mollyAcct.printAcctDetails();
//    }

    public static void main(String[] args){
        Product apples = new Product(10, "apples", 1);
        System.out.println(apples.getProductName());
        Inventory small = new Inventory(new Product(11, "carrots", 2), 5);
        System.out.println(small.getProduct().getProductId());
        Warehouse local = new Warehouse(20, "local", "small");
        System.out.print(local.getWarehouseName());
    }

}
