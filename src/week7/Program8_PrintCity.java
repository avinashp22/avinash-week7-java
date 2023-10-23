package week7;

import java.util.Scanner;

//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if any other alphabet should be invalid entry
public class Program8_PrintCity {

    public static void main(String[] args) {

        char a = 0;
        city(a);

    }

    public static char city(char a) {


        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Alphabet Letter (between A and F)");
        a = scn.next().charAt(0);

        if (a == 'a') {
            System.out.println("Amsterdam");
        } else if (a == 'b') {
            System.out.println("Barcelona");
        } else if (a == 'c') {
            System.out.println("Cairo");
        } else if (a == 'd') {
            System.out.println("Dublin");
        } else if (a == 'e') {
            System.out.println("Edinburgh");
        } else if (a == 'f') {
            System.out.println("Frankfurt");
        } else {
            System.out.println("Entered Letter is Invalid");
        }

        scn.close();
        return a;
    }
}








