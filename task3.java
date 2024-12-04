abstract class Vehicle {
    private String model;
    private int year;
    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public abstract double fuelEfficiency(); 
    public abstract double topSpeed(); 
    public void getDetails() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
class Car extends Vehicle {
    private double fuelConsumption; 

    public Car(String model, int year, double fuelConsumption) {
        super(model, year);
        this.fuelConsumption = fuelConsumption;
    }
    @Override
    public double fuelEfficiency() {
        return fuelConsumption; 
    }
    @Override
    public double topSpeed() {
        return 180.0; 
    }
}
class Bike extends Vehicle {
    private double fuelEfficiency; 

    public Bike(String model, int year, double fuelEfficiency) {
        super(model, year);
        this.fuelEfficiency = fuelEfficiency;
    }
    @Override
    public double fuelEfficiency() {
        return fuelEfficiency; 
    }
    @Override
    public double topSpeed() {
        return 120.0; 
    }
}
public class task3 {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota Camry", 2022, 15.0); 
        car.getDetails();
        System.out.println("Fuel Efficiency: " + car.fuelEfficiency() + " km/l");
        System.out.println("Top Speed: " + car.topSpeed() + " km/h");

        Vehicle bike = new Bike("Yamaha R15", 2021, 40.0); 
        bike.getDetails();
        System.out.println("Fuel Efficiency: " + bike.fuelEfficiency() + " km/l");
        System.out.println("Top Speed: " + bike.topSpeed() + " km/h");
    }
}
