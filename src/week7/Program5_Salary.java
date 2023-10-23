package week7;
/**
 *WAP to input employee id, name, basic salary then
 *find HRA, TA, DA, PF and Gross salary
 *HRA = basic salary 10%
 *DA = Basic salary 8%
 *TA = Basic salary 9%
 *PF= Basic salary 20%
 *Gross salary = basic salary + HRA + TA + DA –PF
 */
import java.util.Scanner;


public class Program5_Salary {

    public static void main(String[] args) {
salary();


    }


    public static void salary(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Employee ID");
        int id = scn.nextInt();
        System.out.println("Enter Employee Name");
        String name = scn.next();
        System.out.println("Enter Basic Salary");
        double sal = scn.nextDouble();

        double hra = (sal*0.10);
        double ta = (sal*0.09);
        double da = (sal*0.08);
        double pf = (sal*0.20);
        double gross = sal + hra + ta + da - pf;

        System.out.println("_______________________________");
        System.out.println("|          Salary slip         |");
        System.out.println("|______________________________|");
        System.out.println("|Employee Id     :" + id+ "        |");
        System.out.println("|Employee Name   :" + name +"         |");
        System.out.println("|______________________________|");
        System.out.println("|Basic Salary    :" + sal+ "      |");
        System.out.println("|HRA 10%         :" + hra+ "       |");
        System.out.println("|TA 8%           :" + ta+ "       |");
        System.out.println("|DA 9%           :" + da+ "       |");
        System.out.println("|PF-20%          :" + pf+ "       |");
        System.out.println("|______________________________|");
        System.out.println("|Gross Salary    :" + gross+ "      |");
        System.out.println("|==============================|");





    }



}
