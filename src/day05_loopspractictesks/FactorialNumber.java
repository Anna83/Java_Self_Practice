package day05_loopspractictesks;
//5. Create a class named FactorialNumber. Write a program that can return the factorial number of any given number.
//
//        Example:
//num = 5
//
//Output:
//        120
//
//        (because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

public class FactorialNumber {

    public static void main(String[] args) {
        int num1 = 5;
        int fact = 1;

        for (int i = 1; i <= num1; i++ ){
            fact = fact * i;

        }
        System.out.println(fact);
    }
}
