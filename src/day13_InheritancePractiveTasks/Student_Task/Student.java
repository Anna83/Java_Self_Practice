package day13_InheritancePractiveTasks.Student_Task;

public class Student extends Person {

    private String studentID;
    private String fieldOfStudy;
    private char grade;
    private String schoolName;

    public Student(String name, int age, char gender, String studentID, String fieldOfStudy,
                   char grade, String schoolName) {
        super(name, age, gender);
        setStudentID(studentID);
        setFieldOfStudy(fieldOfStudy);
        setGrade(grade);
        setSchoolName(schoolName);

    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }


    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(getName() + " from " + getSchoolName()+ " is studying.");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "t{" +
                "name +" + getName() + '\''+
                ", age = " + getAge() +
                "studentID='" + studentID + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
/*
Create a subclass named "Student" with the following specifications:
   Attributes:
       - studentId: String
       - fieldOfStudy: String
       - grade: char
       - schoolName: String

   Encapsulation:
       - Encapsulate all the fields.

   Constructor:
          - Add a constructor that can set all the fields when the Student class is created.

   Actions:
       - study(): Displays a message stating the student's name and school.
       - toString(): Prints the information of the Student object (including all attributes).
 */