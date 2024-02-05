package day09_ArraysPracticeTasks;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

         int[] array = {1,2,3,4,5};
         int[]reversedArray = new int[array.length]; // creating new array all o's now


        for (int i = array.length - 1, j = 0 ; i >= 0; i--,j++) {// iterating i={1,2,3,4,5}; to revers it by adding j
            reversedArray[j]=array[i];

        }
        System.out.println(Arrays.toString(reversedArray));
    }



       }

/*
Create a class named ReverseArray and write a program to reverse an array of integers and return it as a new one.

			Example:


			Output:
				reversedArray = {5,4,3,2,1};

 */