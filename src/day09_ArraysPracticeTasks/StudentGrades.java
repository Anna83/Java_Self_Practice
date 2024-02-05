package day09_ArraysPracticeTasks;

import java.util.Arrays;

public class StudentGrades {
    public static void main(String[] args) {
// store students names and scores

        String[] studentNames = {"Mila", "John", "Smith"};
        int[] score = {90, 80, 70, };

        // create an array to store grades
        char[] grades = new char[score.length];

        // calculate garde for each student
        for (int i = 0; i < studentNames.length; i++) {
            // calculate the grades using method
            grades[i]= calculateGrade(score[i]);
            System.out.println(Arrays.toString(score));
            System.out.println( "Student: "+ studentNames[i]+ "\t score: "
                    +  score[i]+ "\tGrade: " + grades[i]);
            /*
			Output:
				grades = {'A', 'C', 'B'};
				Anna's score is 90, and grade is A
				Nancy's score is 75, and grade is C
				Sarah's score is 80, and grade is B
             */
        }

    }
    public static char //public: this indicates that the method can be accessed from outside of class
                       // Static :indicates that the method belongs to the class
                       // char : that the method will return char character
                       // int score : type of int that the method accepts
    calculateGrade(int score){
        if (score >= 90){
            return 'A';

        } else if (score >= 80){
            return 'B';

        } else if (score >= 60) {
            return 'D';
        }else {
            return 'F';

        }
    }

}




/*
Create a class named StudentGrade and write a program with the following specifications:
	4.1 Given two arrays with the same length:
		   studentNames (String[])
		   scores (int[])

   	4.2 Write a program to determine and store the students' grades
   	in an array of characters named grades.

   	 2.3 Print the grade report for each student in separate lines.

			Example:
				String[] names = {"Anna", "Nancy", "Sarah"};
				int[] scores = {90, 75, 80};

		 2.3 Print the grade report for each student in separate lines.

			Example:
				String[] names = {"Anna", "Nancy", "Sarah"};
				int[] scores = {90, 75, 80};

			Output:
				grades = {'A', 'C', 'B'};
				Anna's score is 90, and grade is A
				Nancy's score is 75, and grade is C
				Sarah's score is 80, and grade is B
 */