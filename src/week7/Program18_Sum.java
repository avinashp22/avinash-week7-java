package week7;
//Write a Java program to sum values of an array
public class Program18_Sum {


    public static void main(String[] args) {
        sum();

    }

public static void sum(){

        int array[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int sum = 0;

        for (int i : array)
            sum += i;
        System.out.println("The sum of Array is " + sum);
    }

}


