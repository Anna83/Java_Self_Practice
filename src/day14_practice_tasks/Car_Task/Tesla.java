package day14_practice_tasks.Car_Task;

import day14_practice_tasks.Car_Task.AutoPilot;
import day14_practice_tasks.Car_Task.Car;

public class Tesla extends Car implements AutoPilot {

    public Tesla(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Tesla has auto park");

    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla has is self driving ");

    }

    @Override
    public void start() {
        System.out.println("Tesla is starting ");

    }

    @Override
    public void drive() {
        System.out.println("Tesla is driving ");

    }
}
/*
 Create two Subclasses of Car ('Tesla' and 'Nio') that
 Implement both AutoPark and AutoPilot Interfaces.
 */