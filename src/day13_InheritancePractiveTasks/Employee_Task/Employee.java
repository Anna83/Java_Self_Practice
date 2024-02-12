package day13_InheritancePractiveTasks.Employee_Task;

import com.sun.source.tree.IfTree;

import java.util.SplittableRandom;

public class Employee extends Person{

    private String employeeID;
    private String jobTitle;
    private double salary;
    private String companyName;


    public Employee(String name, int age, String gender, String employeeID, String jobTitle, double salary, String companyName) {
        super(name, age, gender);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
        this.companyName = companyName;
    }



    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        if(employeeID == null || employeeID.trim().isEmpty()){
            System.err.println("Employee Id cannot be null or empty");
        }

        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle == null || jobTitle.trim().isEmpty()){
            System.err.println("Job title cannot be null, empty, or blank");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }
    public void setSalary(double salary) {
        if (salary <= 0) {
            System.err.println("Salary must be greater than zero.");
            System.exit(1);
        }
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if (companyName == null || companyName.trim().isEmpty()) {
            System.err.println("Company name cannot be null, empty, or blank.");
            System.exit(1);
        }
        this.companyName = companyName;
    }
    public void work(){
        System.out.println(getJobTitle()+ " " + getName() + "is working. ");

    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "employeeID='" + employeeID + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary $ " + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}


/*
1. Create a subclass of Person named "Employee" with the following specifications:
   Attributes:
       - employeeId: String
       - jobTitle: String
       - salary: double
       - companyName: String

   Encapsulation:
       - Same as previous tasks.

   Constructor:
       - Same as previous tasks.

   Methods:
       - work(): Displays the employee's job title and name.
       - toString(): Returns a string representation of the Employee object.
 */