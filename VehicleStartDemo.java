abstract class Vehicle {
    abstract void start();
}
 class Car extends Vehicle {
    void start() { System.out.println("Car starts with a key or push button."); }
}
class Bike extends Vehicle {
    void start() { System.out.println("Bike starts with a self-start button or kick."); }
}
class Bus extends Vehicle {
    void start() { System.out.println("Bus starts using its ignition system."); }
}
 public class VehicleStartDemo {
    public static void main(String[] args) {
        Vehicle[] vehicles = { new Car(), new Bike(), new Bus() };
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }
    }
}
