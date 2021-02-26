import java.util.Scanner;

public class assignment_26 {

   // Write a Program to reverse the given number. //123 => 321

    public static void reverseMethod(int input)
    {
        if (input < 10)
        {
            System.out.println(input);
            return;
        }
        else
            {
            System.out.print(input % 10);
            reverseMethod(input/10);
        }
    }
    public static void main(String args[])
    {
        int input = 0;
        System.out.print("Please enter your number:  ");
        Scanner in = new Scanner(System.in);
        input = in.nextInt();
        System.out.println("================");
        System.out.print("The reverse is :");
        reverseMethod(input);
        System.out.println();
    }
}
