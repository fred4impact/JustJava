package restaurant;

import java.util.List;

public class Order {

    /*
    * Task B
     Order Class: Represents an order with

     Properties like
     orderID,  items,  totalPrice

    Methods:  displayOrderDetails
    and methods to display order details.
    *
    * */


    private int orderID;
    private List<String> items;
    private double totalPrice;

    // Constructor
    public Order(int orderID, List<String> items, double totalPrice) {
        this.orderID = orderID;
        this.items = items;
        this.totalPrice = totalPrice;
    }

    // Getters
    public int getOrderID() {
        return orderID;
    }

    public List<String> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    // Method to display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderID);
        System.out.println("Items: " + String.join(", ", items));
        System.out.println("Total Price: $" + totalPrice);
    }
}

