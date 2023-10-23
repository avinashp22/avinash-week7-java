package week7;
//Write a program that tells us input value is number or an alphabet or symbol

import java.util.Scanner;

public class Program12_InputValue {

    public static void main(String[] args) {
        Program12_InputValue t = new Program12_InputValue();
        t.input();//calling instance method
    }

    public void input() { // instance method
        Scanner scn = new Scanner(System.in); //start scanner
        System.out.println("Enter any number, alphabet or character :");
        char chr = scn.next().charAt(0);
        if (Character.isDigit(chr)) {
            System.out.println(chr + " is number");
        } else if (Character.isAlphabetic(chr)) {
            System.out.println(chr + " is alphabet");
        } else
            System.out.println(chr + " is symbol");
        scn.close(); //close scanner
    }
}
