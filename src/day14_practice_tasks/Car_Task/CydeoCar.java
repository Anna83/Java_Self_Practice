package day14_practice_tasks.Car_Task;

public class CydeoCar extends Car implements AutoPark, AutoPilot, Flyable {

    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Cydeo car is starting ");

    }

    @Override
    public void drive() {
        System.out.println("Cydeo car is driving ");

    }

    @Override
    public void autoPark() {
        System.out.println("Cydeo car has auto park");

    }

    @Override
    public void selfDrive() {
        System.out.println("Cydeo car is self driving ");

    }

    @Override
    public void fly() {
        System.out.println("Cydeo car is flying ");

    }
}
/*
Create a Subclass of Car Named 'CydeoCar' that Implements
 AutoPark, AutoPilot, and Flyable Interfaces.
 */