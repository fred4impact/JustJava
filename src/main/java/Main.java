import account.Bank;
import account.CustomerAccount;
import godwin.Order;
import godwin.Restaurant;

import java.util.Arrays;

public class Main {



    public static void main(String[] arg){

//     // Create an object of a restuarant and order
//
//        Restaurant restaurant1 = new Restaurant("Mc Donalds", "West London"); // instantiation of a class or create an
//        // object oa a
//        // class
//        Order order1 = new Order(001, Arrays.asList("Buger", "Chips", "Drins", "Youghout"), 80.90);
//        Order order2 = new Order(002, Arrays.asList("Chicken Nigget", "Chips", "Fizy"), 80.90);
//        Order order3 = new Order(003, Arrays.asList("Meal", "Bigmac", "chips", "nuggrts", "Fries", "cream", "dessert"),
//                123.90);
//
//        restaurant1.displayRestauranrDetails();
//        restaurant1.processOrder(order1);
//        restaurant1.processOrder(order2);
//        restaurant1.processOrder(order3);

        // Create a new Bank
        Bank bank = new Bank("Global Bank");

        // Create CustomerAccounts
        CustomerAccount account1 = new CustomerAccount(101, "John Doe", 1000.0);
        CustomerAccount account2 = new CustomerAccount(102, "Jane Smith", 5000.0);

        // Add accounts to the bank
        bank.addAccount(account1);
        bank.addAccount(account2);

        // Display all accounts
        bank.displayAllAccounts();

        // Perform deposit and withdrawal operations
        account1.deposit(500.0);
        account1.withdraw(300.0);

        System.out.println("\nUpdated Account Details for John Doe:");
        account1.displayAccountDetails();







    }





}
