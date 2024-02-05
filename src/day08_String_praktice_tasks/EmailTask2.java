package day08_String_praktice_tasks;

import java.util.Scanner;
import java.util.SplittableRandom;

public class EmailTask2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email");
        String email = scan.next();// give you go to print in console

        scan.close();

        String firstName = email.substring(0,email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@")); //prints last name from _ to @
        String domain = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));

        System.out.println("First name: "+ firstName); // how do I change to uppercase
        System.out.println("Last Name: "+ lastName);//  same
        System.out.println("Domain: "+ domain);






    }
}

/*
 Create a class called EmailTask2. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that will print out information about the user based on the email.
Print the first name, last name, and domain. First and last names should be printed with the proper format.
(uppercase first letter and remaining lowercase)

        Example:
              Input:
                 craig_federighi@apple.com

              Output:
                   First name: Craig
                   Last name: Federighi
                   Domain: apple

 */