package week7;

import java.util.Scanner;

/*1. Write a java Program that tells us that Input number is odd or even?
 * Hint: Use ternary operator (?:)
 * */
public class Program1_OddEven {

    public static void main(String[] args) {
oddOrEven1();


    }

    public static void oddOrEven1(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = scn.nextInt();
        String result = number%2==0? "Even" : "Odd";
        System.out.println(number + " is " + result);


    }


}
