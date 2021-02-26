import java.util.Scanner;

public class assignment_29 {

    public static double sumDigit (double input)
    {
        double res = 0 ;
        double fact = 1 ;
        for(int i = 1 ;i <= input; i++ )
        {
            fact = fact * i ;

            res = res + ( i / fact);
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner ank = new Scanner(System.in);

        System.out.println("Enter the numbers: ");

        double input = ank.nextDouble();

        System.out.printf("The sum is: %.2f" , sumDigit(input));
    }
}
