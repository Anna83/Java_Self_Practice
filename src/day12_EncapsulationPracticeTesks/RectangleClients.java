package day12_EncapsulationPracticeTesks;

public class RectangleClients {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(5,10);
        rectangle1.calArea();
        rectangle1.getLength();
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle(2,8);
        rectangle2.getWidth();
        rectangle2.getLength();
        rectangle2.calArea();
        rectangle2.calcPerimeter();
        System.out.println(rectangle2);
    }
}
