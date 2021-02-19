import java.util.Scanner;

public class Assignment_7 {

    public static void main(String[] args) {


        //find the volume of a cylinder

        double pie  = 3.14 ;

        Scanner ank = new Scanner(System.in);

        System.out.println("Enter the radius: ");

        double radius = ank.nextDouble();

        System.out.println("Enter the height: ");

        double height = ank.nextDouble();

        double volume = pie * (radius * radius ) * height;

        System.out.println("The volume of a circle is: "+volume);

        System.out.println("*******************");
        System.out.println("*******************");
    }
}
