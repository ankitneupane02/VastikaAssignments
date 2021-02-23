import java.util.Scanner;

public class Assignment_15 {

    public static void main(String[] args) {
        //Write a program that receives an ASCII code (between 0 – 128)
        // and display its character [example: 97 (input) ->a(output)].

        Scanner ank = new Scanner(System.in);

        System.out.println("Enter a number between 0 to 128");

        int input = ank.nextInt();

        if (input <= 128 || input >= 0)
        {
            System.out.println("The character is : " + (char) input);
        }
        if (input > 0 || input < 128)
        {
            System.out.println("The input is invalid");
        }
    }
}

