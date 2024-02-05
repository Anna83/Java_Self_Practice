package day09_ArraysPracticeTasks;

import java.util.Arrays;

public class ClassMateReversed {
    public static void main(String[] args) {


        String[] classmates = {"Tea Lubura", "Dejan Lubura", "Dijana Kecojevic", "Anna Lubura", "John Smith", "Christal Elliot",
                "James Smith", "Jacki Johnson", "Ema Watson", "Lea Paco"};
        String[] classmatesReversed = new String[classmates.length];

        //  Reverse each student's name and print them on separate lines.

        for (int i = 0; i < classmates.length; i++) {


            classmatesReversed[i] = classmates[i].substring(classmates[i].indexOf(" "))
                    + " " + classmates[i].substring(0, classmates[i].indexOf(" "));

            System.out.println(classmatesReversed[i]);
        }

        }

    }

/*
 Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.

 */