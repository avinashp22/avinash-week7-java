package week7;
//Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
import java.util.Scanner;


public class Program16_CheckNumber {

    public static void main(String[] args) {
        Program16_CheckNumber obj = new Program16_CheckNumber();
        obj.check();
    }


    public void check() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number :");
        int a = scn.nextInt();

        if (a > 0) {
            System.out.println(a + " is positive number");
        } else if (a < 0) {
            System.out.println(a + " is negative number");
        } else {
            System.out.println(a + " is zero");
        }


    }}
