package oop;

public class SportCars extends Car{
    private String turboType;

    public SportCars(){

    }

    public SportCars(String brand, String engineType, int topSpeed, String turboType){
        super(brand, engineType, topSpeed);
        this.turboType = turboType;
    }

    public String getTurboType() {
        return turboType;
    }

    public void setTurboType(String turboType) {
        this.turboType = turboType;
    }
}
