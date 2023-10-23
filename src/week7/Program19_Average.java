package week7;
//Write a Java program to calculate the average value of array elements.

import java.util.Scanner;

public class Program19_Average {

    public static void main(String[] args) { //main method
        Program19_Average.avg();  //call other static method
    }

    public static void avg() {  //other static method
        int sum = 0;
        float average = 0;
        Scanner scn = new Scanner(System.in); //scanner start
        System.out.println("Enter no. of array elements");
        int a = scn.nextInt();
        System.out.println("Enter all element values :");
        int b[] = new int[a];
        scn.close(); // scanner close

        //formula and calculations
        for (int i = 0; i < a; i++) {
            b[i] = scn.nextInt();
            sum = sum + b[i];
            average = (float) sum / a;
        }
        //print average
        System.out.println("Average of array elements is " + average);
    }
}
