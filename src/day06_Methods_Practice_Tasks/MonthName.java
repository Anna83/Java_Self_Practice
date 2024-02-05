package day06_Methods_Practice_Tasks;

public class MonthName {
    public static void main(String[] args) {
        int number = 11;
        String result;

        switch (number) {
            case 1 -> result = ("January");

            case 2 -> result = ("February");

            case 3 -> result = ("March");

            case 4 -> result = ("April");

            case 5 -> result = ("May");

            case 6 -> result = ("June");
            case 7 -> result = ("July");

            case 8 -> result = ("August");

            case 9 -> result = ("September");
            case 10 -> result = ("October");

            case 11 -> result = ("November");

            case 12 -> result = ("December");


            default -> result = ("No such month");

        }
        System.out.println(result);

    }
}

/*
3. Create a class named DayAndMonth:

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
				June

	3.3 Create a method named daysInMonth that displays the number of days in the month based on the given number.
	If the number is invalid, print "Invalid Number."

				Example:
					daysInMonth(6);

				Output:
					June has 30 days
 */


