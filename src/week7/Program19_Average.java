package week7;
//Write a Java program to calculate the average value of array elements.
import java.util.Scanner;

public class Program19_Average {

    public static void main(String[] args) {
        avg();

    }

    public static void avg(){
        int sum = 0;
        float average = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int a = scn.nextInt();
        System.out.println("Enter all elements :");
        int b[]= new int[a];

        for(int i = 0; i<a; i++){
            b[i] = scn.nextInt();
            sum = sum + b[i];
            average = (float)sum/a;
        }


        System.out.println("Average of array elements is "+average);


    }



}
