package day10_WrapperClass;

import java.util.ArrayList;

public class CombineTwoArrays {
    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};
        //combine them into one ArrayList.

        ArrayList<String>list= new ArrayList<>();

        for (String each : arr1) {
            list.add(each);//{"A", "B", "C"};

        }
        for (String each : arr2) {
            list.add(each);//{"D", "E", "F", "G"};

        }

        System.out.println(list);//{"A", "B", "C", "D", "E", "F", "G"}



    }
}
/*
Create a class called CombineTwoArrays and write a program with the following specifications:
   4.1 Given two String arrays, combine them into one ArrayList.

                Example:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};

                Output:
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}

 */