package oop;

public class Car {
    //Fields
   private String brand;
   private String engineType;
   private int topSpeed;

   //Constructors
   public Car(){

   }
    public Car(String brand, String engineType, int topSpeed) {
        this.brand = brand;
        this.engineType = engineType;
        this.topSpeed = topSpeed;
    }


    //Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public StringBuilder carInfo(){
       StringBuilder builder = new StringBuilder();

       builder.append("Brand: " + this.brand +"\n");
       builder.append("Engine Type: " + this.engineType +"\n");
       builder.append("Top Speed: " + this.topSpeed +"\n");

       return builder;
    }
}
