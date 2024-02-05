package day07costum_class_tasks;

public class ItemClients {
    public static void main(String[] args) {

        Item item1 = new Item();

        item1.Item = "Samsung TV";
        item1.unitPrice = 2.000;
        item1.quantity = 5;



        item1.calcCost();
        System.out.println(item1);





    }
}
