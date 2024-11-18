package godwin;

public class Restaurant {



    // Properties
    // name , location

    // Access Modifiers Public means the class or properties made publc can be accescible
    // Private on the class ob ject can access anyprivate object
    // protected can only be access my  a method

    // Properties
    private String name;
    private String location;


    // Constructor
    public Restaurant(String name, String location){

        this.name = name;
        this.location = location;

    }


    //Methods
    public  void processOrder(Order godWin){
       // get information regarding the restuarant name
        System.out.println("Processing order at " + name + "..........");
        godWin.displayOrderDetails();
        System.out.println("Order has been process successfully! \n ");
        System.out.println("..................................");
    }

     public void  displayRestauranrDetails(){
         System.out.println("Restaurant Name: " + name + "Location is ... " + location );
     }





    // Function is a method what can the class of object do , what function can thi class perform?




    //








}
