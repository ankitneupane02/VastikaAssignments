import java.util.Scanner;

public class assignment_40 {

    //Write a program to reverse the string.

    public static void reverseString (String input)
    {
        StringBuilder input1 = new StringBuilder();

        input1.append(input);

        input1.reverse();

        System.out.println("The reverse string is: "+input1);
    }

    public static void main(String[] args) {

        Scanner ank = new Scanner(System.in);

        System.out.print("Enter the string: ");

        String input = ank.next();

        reverseString(input);
    }
}
