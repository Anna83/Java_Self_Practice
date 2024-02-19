package day14_practice_tasks.Device_task;

public class Iphone extends Phone implements Downloadable,AppleApps{
    public Iphone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Iphone is on");

    }

    @Override
    public void turnOff() {
        System.out.println("Iphone is off");
    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand() + " " + getModel() + "is downloading apps from" + appStoreName);
    }
}
