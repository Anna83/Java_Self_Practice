package day11_PracticeTasks;

import java.util.concurrent.Callable;

public class CydeoStudentClients {


    public static void main(String[] args) {

     CydeoStudent student1 = new CydeoStudent("Hanna", 29,
             344,2,31,11);

     CydeoStudent.schoolName = "Cydeo";
     CydeoStudent.SchoolName();
     CydeoStudent.programingLanguage = " Java";
     CydeoStudent.ProgramLanguage();
     CydeoStudent student2 = new CydeoStudent("Hanna",29,335,15,31,11);
        System.out.println(student2);

        CydeoStudent.schoolName = "Tomorrow ";
        CydeoStudent.SchoolName();
        CydeoStudent.programingLanguage = "Python";
        CydeoStudent.ProgramLanguage();
        CydeoStudent student3 = new CydeoStudent("Anna",21,555,5,31,12);

        System.out.println(student3);

        }
    }

