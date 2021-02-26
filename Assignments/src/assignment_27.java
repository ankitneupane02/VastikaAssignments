import java.util.Scanner;

public class assignment_27 {


    // Write a Program to sum each digit of
    // given number as well as product. //456 =>4*5*6 and 4+5+6

    public static int addNumber (int input)
    {
        int sum = 0 ;
        while (input > 0)
        {
            sum = sum + (input % 10) ;
            input = input / 10;
        }
        return  sum ;
    }

    public static int productOfNumber(int input)
    {
        int product = 1 ;
        while (input > 0)
        {
            product = product * (input % 10);
            input = input / 10 ;
        }

        return  product ;

    }
    public static void main(String[] args) {

        Scanner ank = new Scanner(System.in);

        System.out.println("Please enter a number : ");

        int input = ank.nextInt();

        System.out.println("*********************");

        System.out.println("The sum is : " +addNumber(input));

        System.out.println("*********************");

        System.out.println("The product is: "+productOfNumber(input));

        System.out.println("*********************");
    }

}
