3. Vehicle Starting System
A transportation application manages different vehicles such as Car, Bike, and Bus. Every vehicle should have a start() operation, but the way each vehicle starts is different.
Question:
Create an abstract class Vehicle with an abstract method start(). Create subclasses Car, Bike, and Bus and provide their own implementations of start().

import java.util.Scanner;

// Abstract base class
abstract class Vehicle {
    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

   
    public abstract void start();
}

class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println(name + " (Car) starts with a push of the ignition button.");
    }
}

class Bike extends Vehicle {
    public Bike(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println(name + " (Bike) starts with a kick or self-start button.");
    }
}

class Bus extends Vehicle {
    public Bus(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println(name + " (Bus) starts by turning the key and releasing the air brakes.");
    }
}

public class VehicleStartingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vehicle type (1 = Car, 2 = Bike, 3 = Bus): ");
        int type = sc.nextInt();
        sc.nextLine(); // clear leftover newline

        System.out.print("Enter vehicle name: ");
        String name = sc.nextLine();

        Vehicle v;
        switch (type) {
            case 1:
                v = new Car(name);
                break;
            case 2:
                v = new Bike(name);
                break;
            case 3:
                v = new Bus(name);
                break;
            default:
                System.out.println("Invalid vehicle type.");
                sc.close();
                return;
        }

        v.start();
        sc.close();
    }
}