package day06_Methods_Practice_Tasks;

public class MathUtility {
    public static void main(String[] args) {

            int result1 = calculate(10, '+', 20);
            System.out.println(result1);

            double result2 = calculate(2.5, '*', 3.0);
            System.out.println(result2);

            int result3 = square(8);
            System.out.println(result3);

            double result4 = square(1.5);
            System.out.println(result4);

            int result5 = cube(3);
            System.out.println(result5);

            double result6 = cube(2.5);
            System.out.println(result6);
        }

        public static int calculate(int num1, char operation, int num2) {
            switch (operation) {
                case '+' -> {return num1 + num2;}
                case '-' -> {return num1 - num2;}
                case '*' -> {return num1 * num2;}
                case '/' -> {return num1 / num2;}
                default -> {return 0;}
            }
        }

        public static double calculate(double num1, char operation, double num2) {
            switch (operation) {
                case '+' -> {return num1 + num2;}
                case '-' -> {return num1 - num2;}
                case '*' -> {return num1 * num2;}
                case '/' -> {return num1 / num2;}
                default -> {return 0;}
            }
        }

        public static int square(int num1) {
            return calculate(num1, '*', num1);
        }

        public static double square(double num1) {
            return calculate(num1, '*', num1);
        }

        public static int cube(int num1) {
            return calculate(square(num1), '*', num1);
        }

        public static double cube(double num1) {
            return calculate(square(num1), '*', num1);
        }
    }








/*Create a class named DayAndMonth:

	3.1 Create a method named day that displays the day's name based on the given number.
	If the number is invalid, print "Invalid Number".

			Example:
				day(5);

			Output:
				Friday

	3.2 Create a method named monthName that displays the month's name based on the given number.
	If the number is invalid, print "Invalid Number."


			Example:
				monthName(6);

			Output:

3.3 Create a method named daysInMonth that displays the number of days in the month based on the given number.
	If the number is invalid, print "Invalid Number."

				Example:
					daysInMonth(6);

				Output:
					June has 30 days



5. Create a class named MathUtility:

	5.1 Create a method named calculate that takes three arguments (Two integers and a char) and returns the result based on the operator.

		If the operator is +:
			The method should return the addition of the two numbers

		If the operator is -:
			The method should return the subtraction of the two numbers

		If the operator is *:
			The method should return the multiplication of the two numbers

		If the operator is /:
			The method should return the multiplication of the two numbers

	for any other operators, the method should return 0


			Example:
				int result = calculate(10, '+', 20);

			Output:
				30


	5.2 Overload the calculate method to handle double numbers.

			Example:
				double result = calculate(2.5, '*', 3.0);

			Output:
				7.5


	5.3 Create a method named square that takes an int and returns the square, hierarchically calling the
	calculate method to calculate the square.

			Example:
				int num = square(8);

			Output:
				64

	5.4 Overload the square method for double numbers.

			Example:
				double num = square(1.5);

			Output:
				2.25

	5.5 Create a method named cube that takes an int and returns the cube, hierarchically calling the
	square method to calculate the cube.

			Example:
				int num = cube(3);

			Output:
				9

	5.6 Overload the cube method for double numbers.

			Example:
				double num = cube(2.5);

			Output:
				15.625
*/










