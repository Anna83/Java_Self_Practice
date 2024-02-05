package day09_ArraysPracticeTasks;

import java.util.Arrays;

public class Items {

    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
       double[] price = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
       int[] itemIDs = {12345 ,     12346,  12347,    12348,     12349,    12350};

       System.out.println(Arrays.binarySearch(items,"Gloves"));// binary finds specific element "Gloves"


        boolean result = false;
        for (String item : items){ // check if IPad is contained

            if (item.equalsIgnoreCase("IPad")) { // equals to IPad find this word with ignoreCase
                result = true;

            }
        }
        System.out.println(result);

        String[]itemInfo= new String[items.length]; // itemInfo is now item with everything in it

        for (int i = 0; i < items.length; i++) {
            itemInfo[i]= "\n" + items[i]  + "$ " + price[i] + " #" + itemIDs[i];// /n print in new line item + price + itemID
        }                                                                       // combining item + price+ itemId
        System.out.println(Arrays.toString(itemInfo)); // printing everything in itemInfo

        }
    }




/*
 5. Create a class named Items and write a program with the following specifications:
	5.1 Given arrays with the same length:
		String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
		double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
		int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

   5.2 Find the first index number of "Gloves".
   5.3 Check if "iPad" is contained in the item list.
   5.4 Print the report for each shopping item in the format:
   				name - price - #ID

 */