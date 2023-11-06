package week7;
/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

import java.util.Scanner;

public class Program2_LeapYear {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); //scanner start
        System.out.println("Enter the year");
        int year = scn.nextInt();

        Program2_LeapYear leapYear2 = new Program2_LeapYear(); //call other method
        leapYear2.leapYear1(year);
        scn.close(); //scanner close
    }

    public void leapYear1(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { //formula
            System.out.println("The year is a leap year");
        } else System.out.println("The year is not leap year");
    }

}
