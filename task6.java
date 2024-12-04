interface Drivable {
    void start();
    void accelerate();
    void brake();
}

class Car implements Drivable {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println(model + " is starting.");
    }

    @Override
    public void accelerate() {
        System.out.println(model + " is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println(model + " is braking.");
    }
}

class Truck implements Drivable {
    private String model;

    public Truck(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println(model + " is starting.");
    }

    @Override
    public void accelerate() {
        System.out.println(model + " is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println(model + " is braking.");
    }
}

public class task6 {
    public static void main(String[] args) {
        Drivable car = new Car("Honda Civic");
        car.start();
        car.accelerate();
        car.brake();

        Drivable truck = new Truck("Ford F-150");
        truck.start();
        truck.accelerate();
        truck.brake();
    }
}
