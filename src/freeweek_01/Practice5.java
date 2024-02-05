package freeweek_01;

public class Practice5 {
    public static void main(String[] args) {
        int num1= 4;
        int num2 = 8;
        int greatestNumber;

        if (num2 > num1) {
            System.out.println("The greater number is 8");
            greatestNumber=num2;

        } else if (num1>num2) {
            System.out.println("The greatest number is 4");
            greatestNumber= num1;

        }else {
            System.out.println("All even numbers");
        }

        int hour= 14;

        if ( hour>6 && hour < 12) {
            System.out.println("Good Morning");

        } else if (hour>=12 && hour<15 ) {
            System.out.println("Good Afternoon");

        } else if (hour>=15 && hour<22) {
            System.out.println("Good Evening");

        } else {
            System.out.println("This not a valid hour");

        }

        double math= 50;
        double chemestry = 60;
        double biology= 70;
        double average = (math+ chemestry+biology)/3;

        if (average>= 100 && average >=90 ) {
            System.out.println("average is " + average);
            System.out.println("Grade is A");

        } else if (average >= 80 && average >=89) {
            System.out.println("average is " + average);
            System.out.println("Grade is B");

        }else if (average > 70 && average >79) {
            System.out.println("average is " + average);
            System.out.println("Grade is C");

        }else if (average <= 60 && average <69) {
            System.out.println("average is " + average);
            System.out.println("Grade is D");

        }else if (average <= 0 && average <59) {
            System.out.println("average is " + average);
            System.out.println("Grade is F");

        }else{
            System.out.println("Grade invalid");
        }


        double productPrice =199.99;
        double quantity= 10;
        double revenue= productPrice * quantity;



        int x = 10;
        for (int i = 0; i < 5; i++) {
            x+=i;
        }
        System.out.println(x);



        }


        }











