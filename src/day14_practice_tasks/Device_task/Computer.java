package day14_practice_tasks.Device_task;

public abstract class Computer extends Device{

    public Computer(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public void turnOn() {
        System.out.println( getBrand() + " " +getModel() + " turns on by pushing the green button. ");

    }

    @Override
    public void turnOff() {
        System.out.println( getBrand()+ " " + getModel() + " turns off by pushing power button. ");

    }
}
/*
Create a Child Abstract Class of Device Named 'Computer':
    - Add extra methods as needed.
 */