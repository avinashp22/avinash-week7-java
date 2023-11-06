package week7;
//Write a Java program to calculate the average value of array elements.

import java.util.Arrays;

public class Program19_Average {

    public static void main(String[] args) { //main method
        Program19_Average.avg();  //call other static method
    }

    public static void avg() {  //other static method
        // Numeric array declaration
        int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9,10};
        int sum = 0;
        // Calculating the sum of arrays value
        for (int i = 0; i < numArray.length; i++) {
            sum = sum + numArray[i];
        }
        // Finding the average of arrays value
        int average = sum / numArray.length;
        System.out.println("Values of the elements of the array are: " + Arrays.toString(numArray));
        System.out.println("Average of all the values of the array are: " + average);
    }
}
