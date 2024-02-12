package day13_InheritancePractiveTasks.Employee_Task;

public class Driver extends Employee {


    public Driver(String name, int age, String gender, String employeeID, String jobTitle, double salary, String companyName) {
        super(name, age, gender, employeeID, jobTitle, salary, companyName);
    }

    public void work(){
        System.out.println(getName() + " is driving ");
    }
}
