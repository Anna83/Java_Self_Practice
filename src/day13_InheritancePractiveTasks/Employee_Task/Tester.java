package day13_InheritancePractiveTasks.Employee_Task;

public class Tester extends Employee {

    public Tester(String name, int age, String gender, String employeeID, String jobTitle, double salary, String companyName) {
        super(name, age, gender, employeeID, jobTitle, salary, companyName);

}
    @Override
    public void work() {
        System.out.println("Tester " + getName() + " is testing ");
    }
}
