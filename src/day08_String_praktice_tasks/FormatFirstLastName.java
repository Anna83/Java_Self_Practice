package day08_String_praktice_tasks;

import java.util.Scanner;

import static java.lang.String.format;

public class FormatFirstLastName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name ");
        String firstName = input.next();

        System.out.println("Enter your last name:");
        String lastName = input.next();

        firstName = format(firstName); // had to in-port method format()
        lastName = format(lastName);

        String fulname = firstName + " " + lastName;
        System.out.println(fulname);
        input.close();

    }

    public static String format(String name){
        return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        //     this gives first name Cydeo           last name School / first letter in upper case

    }
}

/*
Write a program that asks the user to enter first and last names and then prints the full name in regular format
(first character in uppercase).

        Example:
              Input:
                  firstName = "cyDEo";
                  lastName = "SCHOOL";

              Output:
                   Cydeo School
 */