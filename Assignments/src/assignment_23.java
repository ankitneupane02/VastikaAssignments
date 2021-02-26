import java.util.Scanner;

public class assignment_23 {

   // Write a Program to sum 1 to nth natural numbers.

    public static void sumoFNumbers (int a)
    {
        int total = 0;
        for (int i = 1 ; i <= a ; i++)
        {
            total = total + i ;
        }
        System.out.println("=======================");
        System.out.println("Sum of first " +a+ " natural number is: " +total);
        System.out.println("=======================");
    }

    public static void main(String[] args)
    {

        Scanner ank = new Scanner(System.in);

        System.out.print("Enter a natural you want to add up to: ");

        int a = ank.nextInt();

        sumoFNumbers(a);

    }
}
