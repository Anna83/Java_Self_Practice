package day12_EncapsulationPracticeTesks;

public class CandyClients {
    public static void main(String[] args) {


        Candy candy1 = new Candy("Milka", 1, 4.50, true);

        System.out.println("Name = " + candy1.getBrand());
        System.out.println("$ " + candy1.getQuantity());
        System.out.println("$ " +candy1.getPrice());
      //  System.out.println(candy1.hasPeanuts());??
        System.out.println(candy1);



    }
}
