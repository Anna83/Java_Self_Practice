package day14_practice_tasks.Device_task;

public class Samsung extends Phone implements AndroidApp, Downloadable{

    public Samsung(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Samsung is on");

    }

    @Override
    public void turnOff() {
        System.out.println("Samsung is off ");

    }

    @Override
    public void downloadApp() {
        System.out.println(getBrand()+" "+getModel() + "id downloading apps from "+ appStoreName);

    }
}
