package day09_ArraysPracticeTasks;

public class CommonElements {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 =  {4,5,6,7,8};

      for (int i : arr1)
                for (int j : arr2){
                    if (i==j){ // ako je i isto ko j print common number
                        System.out.println(i);// will print common element
                    }
                }

            }

        }





/*
 Create a class named CommonElements and write a program that prints out the common elements from two integer arrays.

			Example:
				arr1: {1,2,3,4,5}
				arr2: {4,5,6,7,8}

			Output:
				4
				5

 */