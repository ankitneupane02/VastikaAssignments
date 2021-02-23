import java.util.Scanner;

public class Assignment_14 {

    public static void main(String[] args) {

        //Write a program to relate two integers entered by the user using = =or > or < sign.

        Scanner ank = new Scanner(System.in);

        System.out.println("Please enter a first number: ");

        int a = ank.nextInt();

        System.out.println("Please enter a second number: ");

        int b = ank.nextInt();

        if (a > b)
        {
            System.out.println("Number A is greater then B");
        }
        if(b > a )
        {
            System.out.println("Number B is greater than A");
        }
        if ( a == b)
        {
            System.out.println("They are equal");
        }
        else
        {
            System.out.println("===========");
        }
    }
}
