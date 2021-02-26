import java.util.Scanner;

public class assignment_20 {


    //Write a program to create the equivalent of a four-function calculator.
    // The program to enter two integer’s numbers and an operator. It then carries out
    // the specified arithmetic operator operation: addition,
    // subtraction, multiplication or division of the two numbers. Finally, it displays the result.

    public static void calculateInput ( char sign , double  a , double  b )
    {
        if(sign == '+')
        {
            double  sum = a + b ;
            System.out.println("The addition of two numbers is: "+sum);
        }
        else if (sign == '-')
        {
            double  sub = a - b ;
            System.out.println("The substraction of two number is: "+sub);
        }
        else if (sign == '/')
        {
            double div = a / b ;
            System.out.println("The division of two numbers is : "+div);
        }
        else if (sign == '*')
        {
            double mul = a * b ;
            System.out.println("The multiplication of two numbers is : "+mul);
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }

    public static void main(String[] args) {

        Scanner ank = new Scanner(System.in);

        System.out.println("Input the first number: ");

        double a = ank.nextDouble();

        System.out.println("Input the second number: ");

        double b = ank.nextDouble();

        System.out.println("Enter the operation you want to perfor: ");

        char sign = ank.next().charAt(0);

        calculateInput(sign, a ,b );


    }
}
