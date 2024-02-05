package day10_WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLetters {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('$','A','B','1','2','c','d','@','!','3','4'));

            list.removeIf(A-> Character.isLetter(A));// will remove all letters (Can put any letter as character
        System.out.println(list);//['$',  '1', '2', '@', '!', '3', '4']
    }
}
/*
 Create a class called RemoveLetters and write a program with the following steps:
    10.1 Given an ArrayList of characters, remove all the letters.

			Example:
				list = {'$', A', 'B', '1', '2', 'c', 'd', '@', '!', '3', '4'}

			output:
				['$',  '1', '2', '@', '!', '3', '4']

 */