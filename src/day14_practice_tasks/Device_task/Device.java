package day14_practice_tasks.Device_task;

public abstract class Device  {

    private final String brand;
    private final String model;
    private  double price;
    private  String color;
    private final String size;
    public static boolean hasBattery = true;
    public static boolean hasPowerButton = true;

    public Device(String brand, String model, double price, String color,
                  String size, boolean hasBattery, boolean hasPowerButton) {
        if (brand == null || brand.isEmpty()  ){
           throw new RuntimeException("Brand cannot be null or empty");
        }
        if (model == null || model.isEmpty() ){
            throw new RuntimeException("Model cannot be null or empty");
        }
        if (size == null || size.isEmpty()){
            System.out.println("Size cannot be null or empty");
        }

        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
        this.hasBattery = hasBattery;
        this.hasPowerButton = hasPowerButton;
    }

    //  - brand, model, color, and size must not be null or empty.



    public String getBrand() {

        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0){
            System.err.println("Price cannot be negative. ");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color== null || color.isEmpty()){
            throw new RuntimeException("Color cannot be empty or null.");
        }
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }
    public abstract void turnOn();
    public abstract void turnOff();

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "brand ='" + brand + '\'' +
                ", model ='" + model + '\'' +
                ", price $ " + price +
                ", color ='" + color + '\'' +
                ", size =" + size +
                ", hasBattery =" + hasBattery +
                ", hasPowerButton =" + hasPowerButton +
                '}';
    }

}

/*
Device Task Requirements:

        1. Create an Abstract Class Named 'Device':
        - Variables:
        - final brand
        - final model
        - price
        - color
        - final size
        - hasBattery
        - hasPowerButton
    - Encapsulate all fields.
    - Constructor: Initializes all fields.
    - Conditions:
        - brand, model, color, and size must not be null or empty.
        - price must be positive.
        - Abstract Methods:
        - turnOn()
        - turnOff()
    - Non-Abstract Method:
        - toString()

 */