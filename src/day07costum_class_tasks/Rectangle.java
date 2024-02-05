package day07costum_class_tasks;

public class Rectangle {


    public double width;

    public double length;

    public void calculateArea(){
        System.out.println("Area of rectangle: " + (length*width));
    }
    public void calculatePerimeter(){
        System.out.println("Perimeter of Rectangle: " + 2*(length+width));

    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}

/*
Create a custom class named Rectangle with the following attributes and actions:

      Attributes:
            width (double): used for storing the width of the rectangle.
            length (double): used for storing the length of the rectangle.

      Actions:
            calculateArea(): calculates the area of the rectangle, and returns it as a double.
            calculatePerimeter(): calculates the perimeter of the rectangle, and returns it.
            toString(): returns a string representation of the rectangle object.


      Create another class named RectangleClients, create multiple rectangle objects,
       and test each function of the rectangle object.

 */

