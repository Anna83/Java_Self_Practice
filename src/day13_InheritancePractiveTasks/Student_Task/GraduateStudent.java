package day13_InheritancePractiveTasks.Student_Task;

import java.time.LocalDate;

public class GraduateStudent extends Student {


   private LocalDate graduateDate;

    public GraduateStudent(String name, int age, char gender, String studentID, String fieldOfStudy,
                           char grade, String schoolName, LocalDate graduateDate) {
        super(name, age, gender, studentID, fieldOfStudy, grade, schoolName);
        setGraduateDate(graduateDate);
    }

    public LocalDate getGraduateDate() {
        return graduateDate;
    }



    public void setGraduateDate(LocalDate graduateDate) {
        LocalDate today = LocalDate.now();
        if(graduateDate.isBefore(today)){
            this.graduateDate= graduateDate;

        }else {
            System.out.println("You have not graduated yet.");
        }
        System.exit(1);

    }

    @Override
    public void study() {
        super.study();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +"{" +
                "name = '" + getName() + '\''+
                ",studentId = '" + getStudentID() + '\''+
                "graduateDate=" + graduateDate +
                '}';
    }
}



/*
Create GraduateStudent subclasses of the Student class:
        Attributes:
          - graduateDate;
        Encapsulate the fields.
        Add a constructor that can set all the fields when the GraduateStudent object is created.
        Override the the study() method.
 */