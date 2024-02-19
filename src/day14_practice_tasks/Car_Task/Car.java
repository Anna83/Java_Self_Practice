package day14_practice_tasks.Car_Task;

public abstract class Car {

    private final String make;
    private final String model;
    private final int year;
    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        this.make = setMake(make);
        this.model = setModel(model);
        this.year = setYear(year);
        setPrice(price);
        setColor(color);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new RuntimeException("Price cannot be negative ");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()) {
            throw new RuntimeException("Color cannot be null or empty");

        }
        this.color = color;
    }

    public String setMake(String make) {
        if (make == null || make.isEmpty()) {
            throw new RuntimeException("Make cannot be null, or empty");

        }
        return make;
    }

    public String setModel(String model) {
        if (model == null || model.isEmpty()) {

            throw new RuntimeException("Model cannot be null, or empty");
        }
        return model;
    }

    public int setYear(int year) {
        if (year <= 0) {
            throw new RuntimeException("Year cannot be negative ");

        }
        return year;
    }

    // Abstract method
    public abstract void start();

    public abstract void drive();

    public void stop() {
        System.out.println(make  + " is stopping ");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "make = '" + make + '\'' +
                ", model = '" + model + '\'' +
                ", year=" + year +
                ", price $ " + price +
                ", color = '" + color + '\'' +
                '}';
    }
}



/*
Car Task Requirements:
1. Create an Abstract Class Named 'Car':
    - Variables:
        - final make
        - final model
        - final year
        - price
        - color
    - Encapsulate all fields.
    - Constructor: Initializes all fields.
    - Conditions for setting fields:
        - make, model, color must not be null or empty.
        - year must not be less than 1886.
        - price must not be negative.
    - Abstract Methods:
        - start()
        - drive()
    - Non-Abstract Methods:
        - stop()
        - toString()
 */