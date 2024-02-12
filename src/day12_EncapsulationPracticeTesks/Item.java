package day12_EncapsulationPracticeTesks;

import java.rmi.Naming;

public class Item {

    private String name;
    private double unitPrice;
    private double quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ((name.contains(" ")) ||!name.matches("#%%%")&&(name.startsWith("A-Z")) ) {
            System.out.println("The name cannot be empty or blank.");
            System.exit(1);
        }
       this.name=name;
    }
    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        if (unitPrice <=0 ){
            System.out.println("Unit price cannot be negative. ");
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
       if (quantity<0){
           System.out.println("The quantity cannot be 0.");
           System.exit(1);
       }

        this.quantity = quantity;
    }

    public Item(String name, double unitPrice, double quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost(){
       double cost =(unitPrice * quantity);
       return cost;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice = " + unitPrice +
                ", quantity = " + quantity +
                " total cost = " + calcCost() +

                '}';
    }
}

/*
 Create a custom class named Item with the following specifications:

	Attributes:
		name
		unitPrice
		quantity

	Ensure encapsulation for all fields.
		Conditions:
			The name cannot be empty or blank.
			The name cannot contain any special characters other than space.
			The name must start with letters.
			The unitPrice cannot be negative.
			The quantity cannot be negative.

	Add a constructor that enables the user to set all fields during object creation.

	Actions:
		calcCost(): Returns the total cost.
		toString(): Displays the name, unit price, quantity, and total cost calculated by calcCost() when the object is printed.

	Create another class named ItemClients, create multiple item objects, and test each function of the item object.

 */