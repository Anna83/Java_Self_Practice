package day12_EncapsulationPracticeTesks;

import java.util.concurrent.Callable;

public class CircleClients {

    public static void main(String[] args) {



        Circle circle1 = new Circle(4.0);
        System.out.println(circle1);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.calcArea());
        System.out.println(circle1.calcPerimeter());

       Circle circle2 = new Circle( 3);
        System.out.println(circle2);
        System.out.println(circle2.calcArea());
        System.out.println(circle2.getRadius());
        System.out.println(circle2.calcPerimeter());

            }
        }













