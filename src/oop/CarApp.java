package oop;

public class CarApp {
    public static void main(String[] args) {
        // Type casting
        //Polymorphism
        Car car = new Car("Toyota", "V6", 300);
        System.out.println(car.carInfo());

        SportCars sCar = new SportCars();
        sCar.setBrand("BMW");
        sCar.setEngineType("V8 Engine");
        sCar.setTopSpeed(500);
        sCar.setTurboType("Turbo");
        System.out.println(sCar.carInfo());
        System.out.println(sCar.getTurboType());

    }
}
