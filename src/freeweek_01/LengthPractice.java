package freeweek_01;

import java.util.Scanner;

public class LengthPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your fist name:");
        String firstName= input.next();

        System.out.println("Enter your last name:");
        String lastName = input.next();

        input.close();

        int total= firstName.length()+ lastName.length();
        System.out.println("Total numbers in you first name and last name is: " + total);


    }
}
