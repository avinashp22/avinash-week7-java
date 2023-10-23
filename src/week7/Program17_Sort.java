package week7;
//Write a Java program to sort a numeric array and a string array
import java.util.Arrays;

public class Program17_Sort {

    public static void main(String[] args) {
        array();

    }

    public static void array(){
        int [] array1 = {100, 300, 200, 500, 400, 700,600};
        System.out.println("Original numeric array :" + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted numeric array :" + Arrays.toString(array1));

        String [] array2 = {"ab", "ef", "cd", "gh", "kl", "ij", "mn"};
        System.out.println("Original numeric array :" + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted numeric array :" + Arrays.toString(array2));
    }


}
