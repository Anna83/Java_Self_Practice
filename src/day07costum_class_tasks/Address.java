package day07costum_class_tasks;

public class Address {
    public int buildingNumber;
    public String street;
    public String city;
    public String state;
    public String zipCode;



    public String toString() {
        return "Address{" +
                "buildingNumber=" + buildingNumber +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
