package week7;
//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if any other alphabet should be invalid entry

import java.util.Scanner;

public class Program9_City {

    public static void main(String[] args) {  // main method
        char letter = 0;
        city(letter); //call other method
    }

    public static char city(char letter) { //other method parameter letter
        Scanner scn = new Scanner(System.in);  //start scanner
        System.out.println("Enter Alphabet Letter (between A and F)");
        letter = scn.next().charAt(0);
        char letters;
        scn.close(); //close scanner

        //start switch operation
        switch (letter) {
            case 'a':
                System.out.println("Amsterdam");
                break;
            case 'b':
                System.out.println("Barcelona");
                break;
            case 'c':
                System.out.println("Cairo");
                break;
            case 'd':
                System.out.println("Dublin");
                break;
            case 'e':
                System.out.println("Edinburgh");
                break;
            case 'f':
                System.out.println("Frankfurt");
                break;
            default:
                System.out.println("Entered Letter is Invalid");
        }
        return letter;  //return letter to method
    }
}









