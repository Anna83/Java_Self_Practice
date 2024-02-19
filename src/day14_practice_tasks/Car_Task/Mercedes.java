package day14_practice_tasks.Car_Task;

import day14_practice_tasks.Car_Task.AutoPark;
import day14_practice_tasks.Car_Task.Car;

public class Mercedes extends Car implements AutoPark {
    public Mercedes(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Mercedes has auto park");

    }

    @Override
    public void start() {
        System.out.println("Mercedes is staring ");

    }

    @Override
    public void drive() {
        System.out.println("Mercedes is driving ");

    }
}
