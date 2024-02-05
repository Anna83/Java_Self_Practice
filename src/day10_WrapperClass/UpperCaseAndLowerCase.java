package day10_WrapperClass;

public class UpperCaseAndLowerCase {

    public static void main(String[] args) {

        String str = "Java java";

        int  countUpperCase = 0,
                countLowesCase = 0;


        for (char each : str.toCharArray()) {
            if (Character.isLetter(each)) {
                if (Character.isUpperCase(each)) {
                    countUpperCase++;
                } else {
                    countLowesCase++;
                }
            }
        }
        //return true if the total number of uppercase characters is equal to the total
       // number of lowercase characters.
        System.out.println(countLowesCase==countUpperCase);// false
    }

}

/*
Create a class called UpperCaseAndLowerCase and write a program with the following specifications:
   2.1 Given a string, return true if the total number of uppercase characters is equal to the total
   number of lowercase characters.

	        Eamplex:
	            str = "JAVA java";

	        output:
	            true
 */