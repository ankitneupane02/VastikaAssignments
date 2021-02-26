import java.util.Scanner;

public class assignment_19 {


    //Write a Program to accept three sides of a triangle
    // and display which kind of triangle is formed.

    public static void  lagrestSide(int a , int b , int c)
    {
        if(a == b  && a == c && b == c)
        {
            System.out.println(" The triangle is equilateral."); ;
        }
        else if ( a == b || a == c || b == c)
        {
            System.out.println(b+"The  triangle is Isosceles.");;
        }
        else
        {
            System.out.println(c+" The triangle is Scalene.");;
        }
    }

    public static void main(String[] args) {

        Scanner ank = new Scanner(System.in);

        System.out.println("Enter the first side a : ");

        int a = ank.nextInt();

        System.out.println("Enter the second side b : ");

        int b = ank.nextInt();

        System.out.println("Enter the third side c : ");

        int c = ank.nextInt();

        lagrestSide(a , b , c);

    }
}
