package week7;

//Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately
public class Program11_Divide {

    public static void main(String[] args) { //main method
        Program11_Divide obj = new Program11_Divide(); //call other method via object
        obj.input();
    }

    public void input() { //instance method
        //calculations
        System.out.println("Divide  by 3 : ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + " , ");
        }
        System.out.println();
        System.out.println("Divide by 5  :  ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0)
                System.out.print(i + " , ");
        }
    }
}