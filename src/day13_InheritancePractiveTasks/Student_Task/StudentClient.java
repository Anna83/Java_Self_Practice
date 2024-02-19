package day13_InheritancePractiveTasks.Student_Task;

import java.time.LocalDate;

public class StudentClient {
    public static void main(String[] args) {


        Person person1 = new Person("Veysel",35,'M');
        //System.out.println(person1);

        System.out.println(person1);

        System.out.println("--------------------------------------");

        Student student1 = new Student("Abdelilah",30, 'M',
                "B145","Bio",'A',"Yale");

        System.out.println(student1);
        student1.study();

        System.out.println("-----------------------------");

        GraduateStudent graduateStudent = new GraduateStudent("Maksym",30,'M',
                "F785","Math",'A',"Cydeo",LocalDate.of(2024,06,15));

        System.out.println(graduateStudent);



    }
}
