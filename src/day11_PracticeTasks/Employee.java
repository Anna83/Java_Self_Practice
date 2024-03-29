package day11_PracticeTasks;

public class Employee {

    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee(String name, int age, char gender, String jobTitle, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public Employee(String name, int age, String jobTitle, double salary) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
        this.salary = salary;

    }

    public Employee(String name, int age, String jobTitle) {
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
    }

    public void work(){
        System.out.println(name + jobTitle + " is working ");
    }

    @Override
    public String toString() {
        return "Employee{" +
                " name = '" + name + '\'' +
                ", age = " + age +
                ", gender = " + gender +
                ", jobTitle = '" + jobTitle + '\'' +
                ", salary = " + salary +
                '}';
    }


}
/*
Create a custom class named Employee with the following specifications:

	Attributes:
			name (String)
			age (int)
			gender (char)
			jobTitle (String)
			salary (double)

    Constructors:
			Add multiple constructors to set different fields of the employee object.

    Actions:
		work(): prints the job title and name of the employee concatenated with " is working."
		toString(): returns a string representation of the employee object.

	Create another class named EmployeeClients, create multiple employee objects, and test each
	 function of the employee object.
 */