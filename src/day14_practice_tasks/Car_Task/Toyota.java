package day14_practice_tasks.Car_Task;

import day14_practice_tasks.Car_Task.Car;

public class Toyota extends Car {

    public Toyota(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Toyota is starting");

    }

    @Override
    public void drive() {
        System.out.println("Toyota is driving ");

    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

