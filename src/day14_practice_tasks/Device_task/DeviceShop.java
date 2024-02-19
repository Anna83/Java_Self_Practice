package day14_practice_tasks.Device_task;

public class DeviceShop {
    public static void main(String[] args) {


        Iphone iphone = new Iphone("iphone 13","Apple ",999.99,"Black", "6.1",true,true);
        Samsung samsung = new Samsung("Galaxy S21", "F5", 899.99, "6.2", "6.5", true,true);
        Google google = new Google("Pixel 6", "White", 799.9, "White", "6.4",true,true);
        Desktop desktop = new Desktop("Dell", "Inspiron", 699.99, "Silver", "21", false, true);
        Laptop laptop = new Laptop("HP", "Pavilion", 799.99, "Black", "15", true, true);

        iphone.turnOn();
        iphone.turnOff();
        iphone.downloadApp();
        iphone.call(727565656);
        iphone.text(727565656);
        System.out.println(iphone);

        samsung.turnOn();
        samsung.turnOff();
        samsung.call(32222322);
        samsung.text(32222322);
        samsung.downloadApp();
        System.out.println(samsung);

        google.turnOn();
        google.downloadApp();
        google.turnOff();
        System.out.println(google);

        desktop.turnOn();
        desktop.turnOff();
        System.out.println(desktop);

        laptop.turnOn();
        laptop.turnOff();
        System.out.println(laptop);
    }
}
