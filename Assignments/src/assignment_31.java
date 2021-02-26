import java.util.Scanner;

public class assignment_31
{

    public static void getMethod (int a)
    {
        for(int i =1 ; i <= a ; i++)
        {
            for(int j = 1 ; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println(" ");
            System.out.println(" ");
        }
    }

    public static void main(String[] args)
    {

        Scanner ank = new Scanner(System.in);

        System.out.print("Enter a number of rows you want: ");

        int a = ank.nextInt();

        getMethod(a);
    }
}
