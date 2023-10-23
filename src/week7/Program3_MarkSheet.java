package week7;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if
 * %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C
 */

public class Program3_MarkSheet {
    public static void main(String[] args) {
        exam(); // call other method
    }

    public static void exam() {
        Scanner scn = new Scanner(System.in); //start scanner to capture data
        System.out.println("Enter Full Name");
        String name = scn.nextLine();
        System.out.println("Enter Roll Number");
        int roll = scn.nextInt();
        System.out.println("Enter Maths Marks");
        int m1 = scn.nextInt();
        System.out.println("Enter Science Marks");
        int s1 = scn.nextInt();
        System.out.println("Enter English Marks");
        int e1 = scn.nextInt();
        scn.close(); //close scanner

        // give error if out of range
        if (m1 < 0 || m1 > 100) {
            System.out.println("Invalid Input, Marks should between 0 to 100");
        } else if (s1 < 0 || s1 > 100) {
            System.out.println("Invalid Input, Marks should between 0 to 100");
        } else if (e1 < 0 || e1 > 100) {
            System.out.println("Invalid Input, Marks should between 0 to 100");
        } else {

            // calculate results
            int t1 = m1 + s1 + e1;
            double per = t1 * 0.3;
            String grade = "";
            String result = "";
            if (per >= 80)
                grade = "A+";
            else if (per >= 60)
                grade = "A";
            else if (per >= 50)
                grade = "B";
            else if (per >= 35)
                grade = "C";
            if (per < 35) {
                result = "Fail";
            } else {
                result = "Pass";
            }

            // print marks sheet
            System.out.println("_______________________________");
            System.out.println("|       Mark Sheet            |");
            System.out.println("|_____________________________|");
            System.out.println("|Name       :" + name + "              |");
            System.out.println("|Roll no:   :" + roll + "              |");
            System.out.println("|_____________________________|");
            System.out.println("|Subjects   : Marks           |");
            System.out.println("|_____________________________|");
            System.out.println("|Math       :" + m1 + "               |");
            System.out.println("|Science    :" + s1 + "               |");
            System.out.println("|English    :" + e1 + "               |");
            System.out.println("|_____________________________|");
            System.out.println("|Total      :" + t1 + "              |");
            System.out.println("|_____________________________|");
            System.out.println("|Percentage :" + per + "             |");
            System.out.println("|Result     :" + result + "             |");
            System.out.println("|Grade      :" + grade + "             |");
            System.out.println("|_____________________________|");

        }
    }
}