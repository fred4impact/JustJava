package godwin;


import java.sql.SQLOutput;
import java.util.List;



public class Order {


    // Properties
    private int orderID;            // 001
    private List<String> items;     // menu['Bread','drinks'] array
    double totalPrice;  //    godWin


    // Contructor

    public Order(int orderID, List<String> items, double totalPrice){
        this.orderID = orderID;
        this.items = items;
        this.totalPrice = totalPrice;



    }

    //Getters help to get information when using the application
    public int getOrderID() {
        return orderID;
    }

    public List<String> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

   // Methods
  public void displayOrderDetails(){
      // display oderId
      System.out.println("Order ID: " + orderID );
      System.out.println("Items :" + String.join(". ", items));
      System.out.println("Total  Price: $ " + totalPrice);

    }

}
