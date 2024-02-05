package day07costum_class_tasks;

public class Item {

   public String Item;
   public double unitPrice;
    public int quantity;
    public double totalCost;

    public double calcCost(){
        totalCost = quantity * unitPrice;
        return totalCost;

    }

    public String toString() {
        return "Item{" +
                "itemName='" + Item + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalCost=" + totalCost +
                '}';
    }
}



