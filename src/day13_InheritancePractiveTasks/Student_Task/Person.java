package day13_InheritancePractiveTasks.Student_Task;

public class Person {

    private  String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender){
        //this.name = name;
        setName(name);
        //this.age = age;
        setAge(age);
        //this.gender=gender;
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null || name.isEmpty()||name.isBlank()){
            System.err.println("Name can not be null or empty or blank");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.err.println("Age can not be set to negative number.");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender=='M'|| gender=='F'){
            this.gender = gender;
        }else {
            System.err.println("Gender can be set only 'M' or 'F'");
            System.exit(1);
        }


    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*
Create a class named "Person" with the following specifications:
   Attributes:
       - name: String
       - age: int
       - gender: char

   Constructor:
          - Add a constructor that can set all the fields when the Person class is created.

   Encapsulation:
       - Encapsulate all the fields.

   Actions:
       - toString(): Prints the information of the Person object.
 */
