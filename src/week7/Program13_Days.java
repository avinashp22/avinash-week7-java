package week7;
//Write a Java program which input any number between 1 to 7 and it print The Days name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.

import java.util.Scanner;

public class Program13_Days {

    public static void main(String[] args) {  //main method
        Scanner scn = new Scanner(System.in);  //start scanner
        System.out.println("Enter the Day Number : ");
        int day = scn.nextInt();
        int days;
        scn.close(); // close scanner
        //start switch
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }
    }
}