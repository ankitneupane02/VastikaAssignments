import java.util.Scanner;

public class assignment_22 {

    //Write a program to print the table of given numbers.

    public static void tableOfNumber (int a )
    {
        System.out.println("The table is given number is: ");
        for (int i = 1 ; i <= 10 ; i++)
        {

            System.out.println(" " + a * i );
        }

    }

    public static void main(String[] args)
    {

        Scanner ank = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int a = ank.nextInt();

        tableOfNumber(a);

    }
}
