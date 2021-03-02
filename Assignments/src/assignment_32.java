import java.util.Scanner;

public class assignment_32 {


   // Write a Program to accept 5 values in an array and display their sum.


    public static int  getSum(int[] array)
    {
        int sum = 0 ;
        for (int i :  array)
        {
             sum = sum + i ;
        }

        return sum;
    }

    public static void main(String[] args)
    {

        Scanner ank = new Scanner(System.in);

        int [] array = new int[5];
        System.out.println("Enter the numbers: ");
        for (int i = 0 ; i < 5;i++)
        {
            array[i] = ank.nextInt();
        }
        int sum =  getSum(array);
        System.out.println("The sum is : "+sum);

    }
}
