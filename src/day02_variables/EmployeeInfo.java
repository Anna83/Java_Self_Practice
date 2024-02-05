package day02_variables;

public class EmployeeInfo {

    public static void main(String[] args) {

        String employeeName = "Shay";
        int age = 24;
        char gender = 'F';
        String company = "Apple Inc";
        String jobTitle = "SDET";
        double yearsOfExperience =2.5;
        int salary = 1200000;
        boolean isFullTime = true;
        boolean isMarried = false;
        String employeeId = "A101";


        System.out.println("employeeName:  " + employeeName);
        System.out.println("Employee ID:  " + employeeId);
        System.out.println("Gender:  " + gender);
        System.out.println("Age:  " + age);
        System.out.println("Job title:  " + jobTitle);
        System.out.println("Company Name:   " + company);
        System.out.println("Years of experience:  " + yearsOfExperience + " years");
        System.out.println("Salary:  " + salary);
        System.out.println("Married:  " + isMarried);

    }

}

/*
5. Create a class named EmployeeInfo and write a program with the following requirements:

	Declare the following variables:
			employeeName (String)
			age (int)
			gender (char)
			companyName (String)
			jobTitle (String)
			yearsOfExperience (double)
			salary (int)
			isFullTime (boolean)
			isMarried (boolean)
			employeeId (String)

	Display the full employee information in the following format.

			Example:
				employeeName = "Shay";
				age = 24;
				gender = 'F';
				companyName = "Apple Inc";
				jobTitle = "SDET";
				yearsOfExperience = 2.5;
				salary = 120_000;
				isFullTime = true;
				isMarried = false;
				employeeId = "B101";

			Output:
				Employee name: Shay
				Gender: F
				Age: 24
				Employee ID: B101
				Job title: SDET
				Company name: Apple Inc
				Full time: true
				Years of work experience: 2.5 years
				Salary: $120000.0
				Married: false
 */