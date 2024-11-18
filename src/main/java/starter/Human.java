package starter;


public class Human{

    //   Attribute

    String name;
    String eyes;
    String hand;
    String legs;
    String bodyWeight;
    String color;
    String gender;
    double height;
    String hair;


    // Constructor
   public Human(String name, String eyes, String hand , String legs, String gender){

        this.name = name;  // Anytime this hume cass is called you will be asked to provide a name
        this.eyes = eyes;
        this.hand = hand;
        this.legs = legs;
        this.gender = gender;

   }
     /*
     *
     *
     * */
   // Function


   // Create Methods getter and setter
    public void displayName(){
       System.out.println(" my name is "  + name);
    }

    public void run(){
        System.out.println("I can run");
    }

    public void walk(){
        System.out.println("I can Walk ");
    }

    public void sleep(){
        System.out.println("I can sleep ");
    }

    public void setName(String name) {
        this.name = name;
    }


    /*

     Assignment

     1  Create a class of restaurant, Employee, Company vehicle, shop be created in the package
     2. Go to Git create a new repo for the beginnerJava
     3. read about data types
     4. Maven Lifecycle


     */



}
