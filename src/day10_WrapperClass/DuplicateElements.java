package day10_WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElements {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();// Given an ArrayList
        list.addAll(Arrays.asList(1,2,3,4,5));

        list.addAll(list);// appends all elements to the list
        System.out.println(list);//[1,2,3,4,5,1,2,3,4,5];

    }

}
/*
Create a class called DuplicateElements and write a program with the following specifications:
   3.1 Given an ArrayList, duplicate each element in the list.

		 	Example:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,5,1,2,3,4,5];

 */