package day10_WrapperClass;

public class LettersDigitsSpecialChars {

    public static void main(String[] args) {

        String str = "Wooden Spoon123!";

       StringBuilder letters = new StringBuilder();
       StringBuilder digit = new StringBuilder();
       StringBuilder specialChar = new StringBuilder();

      for (char each : str.toCharArray()){

          if (Character.isLetter(each)){
          letters.append(each);

          } else if (Character.isDigit(each)) {
              digit.append(each);

          }else {
              specialChar.append(each);
          }

      }
        System.out.println("letters = "+ letters);
        System.out.println("digit = "+ digit);
        System.out.println("specialChars ="+specialChar);


        }

    }

/*
Create a class called LettersDigitsSpecialChars and write a program with the following specifications:
   1.1 Given a string, retrieve and display the letters, digits, and special characters separately.
   Example:

	        Example:
	            str = "Wooden Spoon123!"

	        output:
	            letters= "WoodenSpoon";
	            Digits = "123";
	            specialChars = " !";


 */