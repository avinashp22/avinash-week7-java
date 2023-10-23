package week7;
//Write a java program to input any number and find out if it’s odd or even

import java.util.Scanner;

public class Program6_EvenOdd {

    public static void main(String[] args) {  //static method
        Program6_EvenOdd obj = new Program6_EvenOdd(); //use object to call instance method
        obj.number();
    }

    public void number() {  //instance method
        Scanner scn = new Scanner(System.in); //scanner starts
        System.out.println("Enter Number");
        int num = scn.nextInt();

        //calculations-formula
        if (num % 2 == 0) {
            System.out.println(num + " is even ");
        } else {
            System.out.println(num + " is odd ");
        }
    }
}
