package day14_practice_tasks.Car_Task;

import day14_practice_tasks.Car_Task.Car;

public class Honda extends Car {

    public Honda(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Honda is starting");

    }

    @Override
    public void drive() {
        System.out.println("Honda is driving ");

    }

    @Override
    public String toString() {
        return super.toString();
    }

}
