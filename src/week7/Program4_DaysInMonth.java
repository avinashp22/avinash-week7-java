package week7;
/**
 * Write a method isLeapYear with a parameter of type int named year.
 * The parameter needs to be greater than or equal to 1 and less than or equal to
 * 9999. If the parameter is not in that range return false.
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
 * otherwise return false.
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 */
import java.util.Scanner;

public class Program4_DaysInMonth {

    public static void main(String[] args) { // main method
        Scanner scn = new Scanner(System.in);  //start scanner
        System.out.println("Enter Year (eg 2012 format)");
        int year = scn.nextInt();
        System.out.println("Enter Month (number digit format eg 2)");
        int month = scn.nextInt();
        System.out.println("The Year " + year + " " + leapYear(year));
        System.out.println("Month " + month + " from year " + year + " has " + daysInMonth(month, year) + " days");
        scn.close(); //close scanner
    }

    //static method
    public static String leapYear(int a) {
        String year;
        if (a > 0 && a < 10000) {
            if (a % 4 == 0 && a % 100 != 0) {
                year = "is leap year";
            } else if (a % 4 == 0 && a % 100 == 0 && a % 400 == 0) {
                year = "is leap year";
            } else
                year = "is not a leap year";
        } else
            year = "is not a valid entry : return -1";
        return year;
    }

    //static method
    public static int daysInMonth(int month, int year) {
        int daysInMonth = 0;
        switch (month) {
            case 1: //Jan
            case 3: //Mar
            case 5: //May
            case 7: //July
            case 8://Aug
            case 10://Oct
            case 12://Dec
                daysInMonth = 31;
                break;
            case 4://Apr
            case 6://Jun
            case 9://Sept
            case 11://Nov
                daysInMonth = 30;
                break;
            case 2://Feb
                if (((year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0))) { //leap year formula
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            default:
                System.out.println("Invalid month: return -1");
                break;
        }
        return daysInMonth;

    }
}



