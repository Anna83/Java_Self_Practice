package day12_EncapsulationPracticeTesks;

public class ItemClients {
    public static void main(String[] args) {

        Item item1 = new Item("Water", 2.50, 24);
        System.out.println(item1.getName());
        System.out.println(item1.getUnitPrice());
        System.out.println(item1.getQuantity());
        System.out.println(item1.calcCost());
        System.out.println(item1);



    }
}
