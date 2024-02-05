package day05_praciceLoops;
// Calculate the sum of even numbers between 1 and 10
// than print rules (use while loop)

public class SumOfEvenNumbers {

    public static void main(String[] args) {

        // For loop Solution:

//        int sumEven = 0;
//
//        for (int i = 0; i <=10; i++) {
//            if (i % 2 == 0){
//                sumEven += i;
//            }
//        }
//        System.out.println(sumEven);

        int num = 0;
         int sumEven= 0;

         while (num<= 10){
             if ( num% 2 == 0)
                 sumEven = sumEven + num;

             num++;
         }
        System.out.println("Sum of the nums " + sumEven);







    }
}
