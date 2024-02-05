package day09_ArraysPracticeTasks;

import java.net.ServerSocket;
import java.util.Arrays;

public class ClassMatesInitials {
    public static void main(String[] args) {


        String[] classMates = {"Anna Lubura", "Dejan Lubura", "Jo Jones", "Susan Smith", "Leah Paco",
                "Maja Butina", "Yulia Roberts", "James Jones", "Hazel Smith", "Mike Jonson "};

        System.out.println(Arrays.toString(classMates));


       // 2.3 Print the initials of each student's name in separate lines.

        for (int i = 0; i < classMates.length; i++) {
            String initials = classMates[i];

            System.out.println(initials.charAt(0)+ "." + initials.charAt(initials.indexOf(" ")+1 ));

        }

        }



    }




/*
2. Create a class named ClassMatesInitials and write a program with the following
   specifications:
   2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines.

 */