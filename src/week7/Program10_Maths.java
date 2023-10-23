package week7;
/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -, /, *) find
 * addition, Subtraction, multiplication and division according to their symbol (using if else)
 */

import java.util.Scanner;

public class Program10_Maths {
    public static void main(String[] args) {
        calc();  //call other method
    }

    public static void calc() {  //other static method
        Scanner scn = new Scanner(System.in);  // start scanner
        System.out.println("Enter first number ");
        int a = scn.nextInt();
        System.out.println("Enter second number ");
        int b = scn.nextInt();
        System.out.println("Enter math symbol (+,-,*,/) ");
        char chr = scn.next().charAt(0);
        scn.close(); //close scanner

        //calculations
        if (chr == '+') {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (chr == '-') {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (chr == '*') {
            System.out.println(a + " X " + b + " = " + (a * b));
        } else if (chr == '/') {
            System.out.println(a + " / " + b + " = " + (a / b));
        } else
            System.out.println("Only (+,-,*,/) is allowed ");  //print error
    }


}
