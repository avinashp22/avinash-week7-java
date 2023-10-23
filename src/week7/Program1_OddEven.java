package week7;
/**
 * Write a java Program that tells us that Input number is odd or even?
 * Hint: Use ternary operator (?:)
 */

import java.util.Scanner;

public class Program1_OddEven {

    public static void main(String[] args) {
        oddOrEven1(); //call other method
    }

    public static void oddOrEven1() {
        Scanner scn = new Scanner(System.in); //scanner start
        System.out.println("Enter Number");
        int number = scn.nextInt();
        String result = number % 2 == 0 ? "Even" : "Odd"; //ternary operator
        System.out.println(number + " is " + result);
        scn.close(); //scanner close
    }
}
