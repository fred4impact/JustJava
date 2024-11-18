package account;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private final String bankName;
    private final List<CustomerAccount> accounts;

    // Constructor
    public Bank(String bankName) {
        this.bankName = bankName;
        this.accounts = new ArrayList<>();
    }

    // Method to add an account to the bank
    public void addAccount(CustomerAccount account) {
        accounts.add(account);
        System.out.println("Account for " + account.getAccountHolderName() + " added to " + bankName);
    }

    // Method to display all accounts
    public void displayAllAccounts() {
        System.out.println("\nAccounts at " + bankName + ":");
        for (CustomerAccount account : accounts) {
            account.displayAccountDetails();
            System.out.println("---------------------");
        }
    }




}
