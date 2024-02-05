package day10_WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumAndMaximum {
    public static void main(String[] args) {


        ArrayList<Integer>list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));

        int max = list.get(4); // int max and int min were done with 0,0,// but I have same output like this
        int min = list.get(1);

        for (Integer each : list) {

            if (each > max ){
            max= each;
        }

        if (each < min ) {
            min = each;
        }

        }
        System.out.println("max = "+ max);
        System.out.println("min = "+ min);
    }
}
/*
Create a class called MaximumAndMinimumNumbers and write a program with the following specifications:
   7.1 Given an ArrayList of integers, find and display the maximum and minimum numbers without using any sorting.

			Example:
				list = [Create a class called MaximumAndMinimumNumbers and write a program with the following specifications:
   7.1 Given an ArrayList of integers, find and display the maximum and minimum numbers without using any sorting.

			Example:
				list = [1,2,3,4,5];

			output:
			    Maximum number is 5
			    Minimum number is 1];

			output:
			    Maximum number is 5
			    Minimum number is 1
 */