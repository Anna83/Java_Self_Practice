package day07costum_class_tasks;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public String jobTitle; // can it be just title?
    public double salary;

    public void firstName() {

        System.out.println(name + " is first name");
    }
    public void givenAge() {
        System.out.println(age + " is age of the employee");

    }
    public void givenGender() {
        System.out.println(gender + " is age  ");
    }

    public void setJobTitle() {
        System.out.println(jobTitle + " is job title");
    }
    public void earnings(){
        System.out.println(salary + " is salary");


    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*
 Create a class named Employee with the following attributes and actions:

      Attributes:
            name (String): used for storing the name of the employee
            age (int): used for storing the age of the employee
            gender (char): used for storing the gender of the employee
            jobTitle (String): used for storing the job title of the employee
            salary (double): used for storing the job title

      Actions:
            work(): plays the job title and name of the employee concatenated with " is working."

            toString(): returns a string representation of the employee object.

      Create another class named EmployeeClients, create multiple employee objects, and test each function of the employee object.

 */