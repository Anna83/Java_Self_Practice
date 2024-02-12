package day11_PracticeTasks;

public class Pizza {

public String size ;
public int numberOfCheeseTopping,
        numberOfPepperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public int calcCost() {
        int sizePrice = 0;
        if (size.equalsIgnoreCase("small")) {
            sizePrice = 10;
        } else if (size.equalsIgnoreCase("medium")) {
            sizePrice = 12;

        } else if (size.equalsIgnoreCase("large")) {
            sizePrice = 14;

        }
        int toppings = (numberOfCheeseTopping + numberOfPepperoniTopping) * 2;
        return sizePrice + toppings;
    }


    public String toString() {
        return "Pizza{" +
                "size = '" + size + '\'' +
                ", numberOfCheeseTopping = " + numberOfCheeseTopping +
                ", numberOfPepperoniTopping = " + numberOfPepperoniTopping +
                " pizza cost = " + '$' + calcCost() +
                '}';
    }
}
/*
 Create a custom class named Pizza with the following specifications:

    Attributes:
		   size
		   numberOfCheeseTopping
		   numberOfPepperoniTopping

	Actions:
		calcCost(): returns the totalCost of the pizza
		toString(): returns a String containing the pizza size, quantity of each topping,
		and the pizza cost as calculated by calcCost()
		Pizza cost is determined by:
   		Small: $10 + $2 per topping
   		Medium: $12 + $2 per topping
   		Large: $14 + $2 per topping

    Create another class named PizzaClients, create multiple pizza objects,
     and test each function of the pizza object.

 */