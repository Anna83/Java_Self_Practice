package day06_Methods_Practice_Tasks;
//2. Create a class named SalaryCalculator and create a method named salary that takes hourly rate (double)
//and weekly hours (int) and returns the salary.
//
//Example:
//double income = salary(45, 40);
//
//Output:
//        93600.0

public class SalaryCalculator {
    public static void main(String[] args) {
        double income = 52 * salary(45,40);
        System.out.println(income);
    }

    public static double salary(double hourlyRate, int weeklyHours){
        double salary = hourlyRate * weeklyHours;
        return salary;
    }
}