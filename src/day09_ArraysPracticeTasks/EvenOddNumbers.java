package day09_ArraysPracticeTasks;

public class EvenOddNumbers {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int evenNumber = 0;
        int OddNumber = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                evenNumber++;

        }else {
                OddNumber++;

            }

        }

        System.out.println("The array has " + OddNumber + " " + "odd numbers and "+ evenNumber + " " + "even numbers ");

    }


}
/*
Create a class named EvenOddNumbers and write a program that counts the even and odd numbers from an array of integers.

			Example:
				array = {1, 2, 3, 4, 5, 6, 7};

			Output:
				The array has 4 odd numbers and 3 even numbers.


 */