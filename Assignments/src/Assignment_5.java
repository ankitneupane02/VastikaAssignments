import java.util.Scanner;

public class Assignment_5 {

    public static void main(String[] args) {

       //area if circle

        Scanner ank = new Scanner(System.in);

        double valuePi = 3.14;

        System.out.println("=====================");
        System.out.println("=====================");

        System.out.println("Please enter the radius of circle: ");

        int r = ank.nextInt();

        double area = valuePi * r * r ;

        System.out.println("The area of circle is: "+ area);

        //now for the area of rectangle

        System.out.println("=====================");
        System.out.println("=====================");

        System.out.println("Enter the length: ");

        int length = ank.nextInt();

        System.out.println("Enter the width: ");

        int width = ank.nextInt();

        int areaRectangle = length * width;

        System.out.println("The area of rectangle is: "+areaRectangle);

        System.out.println("=====================");
        System.out.println("=====================");

        //lets find the area of triangle

        System.out.println("Enter the base: ");

        int base = ank.nextInt();

        System.out.println("Enter the height: ");

        int height = ank.nextInt();

        int areaTriangle = (base * height)/ 2;

        System.out.println("The area of traingle is: "+areaTriangle);

        System.out.println("=====================");
        System.out.println("=====================");

    }
}
