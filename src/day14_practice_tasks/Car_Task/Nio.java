package day14_practice_tasks.Car_Task;

import day14_practice_tasks.Car_Task.AutoPilot;
import day14_practice_tasks.Car_Task.Car;

public class Nio extends Car implements AutoPilot {

    public Nio(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Nio can auto park");

    }

    @Override
    public void selfDrive() {
        System.out.println("Nio is self diving ");

    }

    @Override
    public void start() {
        System.out.println("Nio is starting ");

    }

    @Override
    public void drive() {
        System.out.println("Nio is driving");
    }
}
/*
 Create two Subclasses of Car ('Tesla' and 'Nio') that Implement
 both AutoPark and AutoPilot Interfaces.
 */