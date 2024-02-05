package day07costum_class_tasks;

public class RectangleClients {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();

        rectangle1.width = 5;
        rectangle1.length = 10;

        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();

        System.out.println(rectangle1 );


    }
}
