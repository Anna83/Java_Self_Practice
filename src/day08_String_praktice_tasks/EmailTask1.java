package day08_String_praktice_tasks;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {

        String email = "mike_tyson@gmail.com";


        String firstname = email.substring(0, email.indexOf("_"));// 0 je " i onda se printa ime sa index of i do _
        String lastName = email.substring(email.indexOf("_")+1,email.indexOf("@"));// ovde se printa idexof prezime od _do@
        String rest = email.substring(email.indexOf("@"));

        email= lastName + "_"+ firstname+ rest;

        System.out.println(email);





    }
}
/*
Create a class called EmailTask1. Assume that the email address is constructed by a person's first name followed
by an underscore and last name. Write a program that can swap the first name with the last name in the email
(separated by an underscore). If the email doesn't contain an underscore, print the given input email.

        Example:
              Input:
                 mike_tyson@gmail.com

              Output:
                  tyson_mike@gmail.com


 */