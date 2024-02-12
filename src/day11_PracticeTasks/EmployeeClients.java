package day11_PracticeTasks;

public class EmployeeClients {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Josh",29,'M',"RNA",100_000);
        System.out.println(employee1);

        Employee employee2 = new Employee("Lea", 25, 'F', "Teacher",75_000);


        Employee employee3 = new Employee("Christal", 40,'F', " CNA",45_000 );
        employee3.work();

        Employee employee4 = new Employee("Jo",45,"Contractor");
        System.out.println(employee4);

    }
}
