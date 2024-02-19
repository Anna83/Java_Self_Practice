package day14_practice_tasks.Car_Task;

public class Audi extends Car implements AutoPark {

    public Audi(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println("Audi has auto Park");

    }

    @Override
    public void start() {
        System.out.println("Audi is starting ");

    }

    @Override
    public void drive() {
        System.out.println("Audi is driving");

    }


}

