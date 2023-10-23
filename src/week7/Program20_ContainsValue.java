package week7;
//Write a Java program to test if an array contains a specific value.
public class Program20_ContainsValue {


    public static void main(String[] args) {
        int[] array = {2,4,6,8,10,12,14,16,18,20};

        System.out.println(contains(array,12));

    }

    public static boolean contains (int[] arr, int item){

        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }




}
