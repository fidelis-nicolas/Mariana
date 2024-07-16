package oop;

public class Car {
    //A class is a blueprint of an object

    /*
        Conventions of naming classes
        1. Class name should always start with upper cases
        2. A class name cannot start number and special character except underscore "_"
        3. A class name should be one word
        5. Cases applies to naming classes
     */

    //Properties, State, Fields

    public String brand;
    public String color;
    public int year;
    public String wheelTYpe;
    public boolean engineStatus;

    /*
        Access specifiers
          1. public -> Available to all classes withing the project
          2. Protected -> Available to all classes in the same package
          3. private -> Only available to the class in which it was created
     */
    /*
        Format for creating methods
        access specifier return type method name (parameters) {
            programs ............
        }
     */

    public void move(){
        System.out.println(brand + " is moving...");
    }
    public void playMusic(String track){
        System.out.println("Playing... " + track);
    }
    public boolean startEngine(){
        engineStatus = true;
        return engineStatus;
    }
    public boolean offEngine(){
        engineStatus = false;
        return engineStatus;
    }

    public int calculateTotalMileage(int distance, int day){
        int total = distance * day;
        return total;
    }
    // Create a method print all the car information
}
