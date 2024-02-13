package day13_InheritancePractiveTasks.Phone_Task;

public class IPhone {
    private String brand;
    private String model;
    private String size;
    private double price;

    private String color;

    public IPhone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand == null || brand.isBlank() || brand.isEmpty()){
            System.out.println("The brand cannot be null, zero or empty");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model == null || brand.isBlank() || model.isEmpty()) {
            System.out.println("The model cannot be null, zero or empty");
            System.exit(1);
        }
        this.model = model;
    }
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0){
            System.err.println("The price cannot be negative " + price);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color == null || color.isBlank() || color.isEmpty()) {
            System.out.println("The color cannot be null, zero or empty");
            System.exit(1);
        }
        this.color = color;
    }
    public void call(String phoneNumber){
        System.out.println("Calling the number " + phoneNumber);
    }

    public void text(String phoneNumber){
        System.out.println("Texting to the number " + phoneNumber);
    }

    public void faceTime(String phoneNumber){
        System.out.println("Facetiming with the number " + phoneNumber);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "brand='" + brand + '\'' +
                ", model ='" + model + '\'' +
                ", size ='" + size + '\'' +
                ", price =" + price +
                ", color ='" + color + '\'' +
                '}';
    }

}