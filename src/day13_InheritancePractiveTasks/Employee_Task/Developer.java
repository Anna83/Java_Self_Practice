package day13_InheritancePractiveTasks.Employee_Task;

public class Developer extends Employee {
private String programingLanguage;


    public Developer(String name, int age, String gender, String employeeID, String jobTitle, double salary, String companyName) {
        super(name, age, gender, employeeID, jobTitle, salary, companyName);
    }


    public String getProgramingLanguage() {
        return programingLanguage;
    }

    public void setProgramingLanguage(String programingLanguage) {
        if (programingLanguage == null || programingLanguage.trim().isEmpty()){
          throw new RuntimeException("Programing language cannot be null, empty, or blank");

        }
        this.programingLanguage = programingLanguage;
    }

    @Override
    public void work() {
        System.out.println("Developer " + getName() + " is coding in " + programingLanguage);
    }

}



