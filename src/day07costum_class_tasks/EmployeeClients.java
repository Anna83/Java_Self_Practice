package day07costum_class_tasks;

public class EmployeeClients {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Debbie";
        employee1.age = 29;
        employee1.gender = 'F';
        employee1.jobTitle = "Nurse";
        employee1.salary = 60.000; //????

        System.out.println("Name: " + employee1.name + " is working");
        System.out.println("Age: " + employee1.age);
        System.out.println("Gender: " + employee1.gender);
        System.out.println("Job Title: " + employee1.jobTitle + " is working");
        System.out.println("Salary: = " + employee1.salary);

        System.out.println("------------------------------------");




        Employee employee2 = new Employee();
        employee2.name = "Anna";
        employee2.age =39;
        employee2.gender = 'F';
        employee2.salary = 30.000;

        System.out.println(employee2);



        Employee employee3 = new Employee();

    }
}
