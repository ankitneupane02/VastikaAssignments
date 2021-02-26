import java.util.Scanner;

public class assignment_18
{

    //Write a program to display the largest number from given three values.

    public static void largrstValue (int a , int b , int c)
    {


        if(a > b && a > c )
        {
            System.out.println(a+" is the greatest number."); ;
        }
        if(b > c && b > a)
        {
            System.out.println(b+" is the greatest number.");;
        }
        if(c > b && c > a)
        {
            System.out.println(c+" is the greatest number.");;
        }
    }

    public static void main(String[] args) {

        Scanner ank = new Scanner(System.in);

        System.out.print("Enter the first number: ");

        int a = ank.nextInt();

        System.out.print("Enter the second number: ");

        int b = ank.nextInt();

        System.out.print("Enter the third number: ");

        int c = ank.nextInt();

        largrstValue(a , b , c);

    }
}
