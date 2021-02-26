import java.util.Scanner;

public class assignment_30 {

    //Write a program to print the Fibonacci series. 1 1 2 3 5 8 ….

    public static void getNumber(int input)
    {
        int num1 = 0 ;
        int num2 = 1 ;
        int nextTerm = 0;
        while (nextTerm < input)
        {
            System.out.printf(num1+ " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            nextTerm = nextTerm + 1 ;
        }
    }
    public static void main(String[] args)
    {

        Scanner ank = new Scanner(System.in);

        System.out.println("Enter the number: ");

        int input = ank.nextInt();

        System.out.println("The fibonacci Series is: ");

        getNumber(input);

    }
}
