import java.util.Scanner;

public class Assignment_6 {

    public static void main(String[] args) {


        //Write a program to find the perimeter of a circle, triangle, and rectangle.

        //perimeter of circle

        Scanner neu = new Scanner(System.in);

        double pie ;

        pie = 3.14 ;

        System.out.println("Enter the radius: ");

        double r = neu.nextDouble();

        double c = 2 * pie * r ;

        System.out.println("The perimeter of circle is: "+c);

        System.out.println("--------------------------");
        System.out.println("--------------------------");

        //perimeter of triangle

        System.out.println("Enter the side a : ");

        int a = neu.nextInt();
        System.out.println("Enter the side b : ");

        int b  = neu.nextInt();
        System.out.println("Enter the side c : ");

        int cm= neu.nextInt();

        int perimeter = a + b + cm ;

        System.out.println("The perimeter of triangle is: "+perimeter);

        System.out.println("--------------------------");
        System.out.println("--------------------------");

        //perimeter of rectangle

        System.out.println("Enter the length: ");

        int length = neu.nextInt();
        System.out.println("Enter the width: ");

        int width = neu.nextInt();

        int Rectangle = 2 * (length+ width);

        System.out.println("The perimeter of rectangle is: "+Rectangle);

        System.out.println("--------------------------");
        System.out.println("--------------------------");







    }
}
