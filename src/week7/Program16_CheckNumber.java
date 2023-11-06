package week7;
//Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”

import java.util.Scanner;

public class Program16_CheckNumber {

    public static void main(String[] args) { //main method
        Program16_CheckNumber obj = new Program16_CheckNumber(); //use object to call instance method
        obj.check();
    }

    public void check() { //istance method
        Scanner scn = new Scanner(System.in); //scanner starts
        System.out.println("Enter number :");
        int a = scn.nextInt();
        scn.close(); // scanner closes

        //calculations
        if (a > 0) {
            System.out.println(a + " is positive number");
        } else if (a < 0) {
            System.out.println(a + " is negative number");
        } else {
            System.out.println(a + " is zero");
        }
    }
}
