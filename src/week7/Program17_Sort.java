package week7;
//Write a Java program to sort a numeric array and a string array

import java.util.Arrays;

public class Program17_Sort {

    public static void main(String[] args) {  //main method
        Program17_Sort.array(); //call other static method using classname
    }
    public static void array() { //other static method
        int[] array1 = {100, 300, 200, 500, 400, 700, 600}; //array
        System.out.println("Original numeric array :" + Arrays.toString(array1)); //unsorted
        Arrays.sort(array1); //has to be here before sorted
        System.out.println("Sorted numeric array :" + Arrays.toString(array1)); //sorted

        String[] array2 = {"ab", "ef", "cd", "gh", "kl", "ij", "mn"};  //array
        System.out.println("Original numeric array :" + Arrays.toString(array2)); //unsorted
        Arrays.sort(array2); //has to be here before sorted
        System.out.println("Sorted numeric array :" + Arrays.toString(array2));  //sorted
    }
}
