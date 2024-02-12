package day13_InheritancePractiveTasks.Employee_Task;

public class EmployeeClients {

    public static void main(String[] args) {


        Tester tester = new Tester("John", 39, "M", "A01", "Tester", 100_000,"Google");
        Developer developer = new Developer("Jo", 34,"M","A02","Developer", 150_000,"Amazon");
        Teacher teacher = new Teacher("Samantha", 29,"F","A04","Teacher",70_000,"Plato Academy");
        Driver driver = new Driver("James ",45,"M","A05","Driver",150_000,"Target");

        tester.work();
        developer.work();
        teacher.work();
        driver.work();






    }
}
