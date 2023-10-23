package week7;

//Write a Java program to sum values of an array
public class Program18_Sum {

    public static void main(String[] args) { //main method
        sum(); //other method
    }

    public static void sum() { // static method
        int array[] = {10, 20, 30, 40, 50, 60, 70, 80, 90}; // array

        //calculations and formula
        int sum = 0;
        for (int s : array)
            sum += s;
        System.out.println("The sum of Array is " + sum);
    }
}


