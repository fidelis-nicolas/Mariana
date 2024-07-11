package oop;

public class CarApp {
    public static void main(String[] args) {
        //An object is an instance of a class

        Car firstCar = new Car();
        firstCar.brand = "Lambo";
        firstCar.color = "White";
        firstCar.wheelTYpe = "Alloy wheel";
        firstCar.year = 2024;
        firstCar.move(); // Calling method
        firstCar.move();
        firstCar.playMusic("Aylon");
        firstCar.offEngine();
        //

        Car secondCar = new Car();
        secondCar.wheelTYpe = "Aluminium";
        secondCar.color = "black";
        secondCar.brand = "Toyota";
        secondCar.year = 2023;
        secondCar.move();
        secondCar.playMusic("Burna boy");
        secondCar.playMusic("on the low");



    }
}
