import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;

import java.util.Scanner;

public class assignment_28 {

    public static void isPrimeNumber(int input)
    {
        boolean flag = false ;
        int i = 2 ;
        while ( i <= input/2 )
        {
            if(input % i ==0)
            {
                flag = true ;
                break;
            }
            i++;
        }
        if(!flag)
        {
            System.out.println(input+" is a prime number.");
        }
        else
        {
            System.out.println(input+ " is not a prime number.");
        }
    }

    public static void firstNthPrime(int input)
    {
        int status = 1;
        int num = 3;

        if (input >= 1)
        {
            System.out.println("First " + input + " prime numbers are:");
            System.out.println(2);
        }
        for (int i = 2; i <= input; )
        {
            for (int j = 2; j <= Math.sqrt(num); j++)
            {
                if (input % j == 0)
                {
                    status = 0;
                    break;
                }
            }
            if (status != 0)
            {
                System.out.println(num);
                i++;
            }
            status = 1;
            num++;
        }
    }

    public static void main(String[] args)
    {

        Scanner ank = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int input = ank.nextInt();

        isPrimeNumber(input);

        firstNthPrime(input);

        System.out.println("Enter the first range: ");

        int a = ank.nextInt();

        System.out.println("Enter the second number: ");

        int b = ank.nextInt();

        System.out.print(primeNumber(a,b));

    }

    public static int primeNumber(int a , int b)
    {
        int flag;
        for (int i = a; i <= b; i++)
        {
            if (i == 1 || i == 0)
                continue;

            flag = 1;
            for (int j = 2; j <= i / 2; j++)
            {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) System.out.println(i);
        }
        return 0;
    }
}
