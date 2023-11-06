package week7;

//Write a Java program to test if an array contains a specific value.
public class Program20_ContainsValue {

    public static void main(String[] args) { // main method
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};  //array
        System.out.println(contains(array, 13)); //change item number here to check if in array
    }

    public static boolean contains(int[] array, int item) {
        for (int num : array) {
            if (item == num) {
                return true;
            }
        }
        return false;
    }
}
