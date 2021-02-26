import java.util.Scanner;

public class assignment_24 {

    //Write a program to print the factorial number of given numbers.

    public static void numberFactorial (int a)
    {

        int i = 1 ;

        int total = 1;

        while ( i <= a)
        {
            total = total *= i ;
            i++;
        }
        System.out.println("The factorial of a given number " +a+ " is: "+total);
    }

    public static void main(String[] args) {

        Scanner ank = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int a = ank.nextInt();

        numberFactorial(a);
    }

}
