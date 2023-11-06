package week7;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales
 * Commission Sales amount >= 50,000 35% Sales amount >= 30,000 20% >= 20,000 10% >= 10,000 5% < 10,0
 */
public class Program7_Sales {

    public static void main(String[] args) { //main static method
        sales(); //call other static method
    }

    public static void sales() {
        Scanner scn = new Scanner(System.in);  //scanner starts
        System.out.println("Enter Sales ID :");
        int id = scn.nextInt();
        System.out.println("Enter Seller's Name :");
        String name = scn.next();
        System.out.println("Enter Sales amount :");
        double sa = scn.nextDouble();
        System.out.println("Enter Salary basic :");
        int sb = scn.nextInt();
        scn.close();  //scanner closes

        //formula and calculations
        double c = 0;
        if (sa >= 50000) {
            c = (sa * 0.35);
        } else if (sa >= 30000 && sa < 49999) {
            c = (sa * 0.20);
        } else if (sa >= 20000 && sa < 29999) {
            c = (sa * 0.10);
        } else if (sa >= 10000 && sa < 19999) {
            c = (sa * 0.05);
        } else if (sa < 10000) {
            c = (sa * 0.02);
        }
        System.out.println("commission :" + c);


    }


}


















