package day12_EncapsulationPracticeTesks;

public class Rectangle {

    private double width;
    private double length;

    public void setWidth(int width) {
        this.width = width;

    }
    public double getWidth() {
        if (width <= 0 ) {
            System.out.println("Width cannot be set to 0");
            System.exit(1);
        }
        return width;
    }

    public void setLength(double length) {
            this.length = length;
        }


        public double getLength() {
            if (length <= 0 ) { // less or equal to 0
                System.out.println("Length cannot be set to 0 or negative ");
                System.exit(1);
            }
           return width;

        }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public double calArea(){
        return width*length;
    }
    public double calcPerimeter(){
        return (width * length) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width = " + width +
                ", length = " + length +
                " area = " + calArea() +
                "perimeter = " + "," + calcPerimeter()+
                '}';
    }
}



/*

2. Create a custom class named Rectangle with the following specifications:

	Attributes:
		width
		length

	Ensure encapsulation for both fields.
		Conditions:
			The width and length cannot be set to negative or zero values.

	Add a constructor that allows the user to set both fields during object creation.

	Actions:
		calcArea(): Calculates and returns the area of the rectangle object.
		calcPerimeter(): Calculates and returns the perimeter of the rectangle object.
		toString(): Displays the width, length, area, and perimeter of the rectangle when the object is printed.

	Create another class named RectangleClients, create multiple rectangle objects, and test each function of the rectangle object.



 */