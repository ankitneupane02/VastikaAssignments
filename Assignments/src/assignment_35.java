import java.util.Scanner;

public class assignment_35 {

    //Write a function to find the second largest
    // number in a given array.

    public static int getSecondLargest(int [] input)
    {
        int temp ;
        int size = input.length;
        for (int i = 0 ; i < size;i++)
        {
            for(int j = i + 1 ; j < size;j++)
            {
                if(input[i] > input[j])
                {
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        return input[size- 2];
    }

    public static void main(String[] args) {

        Scanner ank = new Scanner(System.in);

        int array [] = {10,50,100,40,90,99,45,56};

        System.out.println("The numbers in the array are: ");

        for(int i = 0 ; i < array.length;i++)
        {
            System.out.print(array[i]+" ");
        }

        System.out.println();

        System.out.print("The second largest is: ");

        System.out.print(getSecondLargest(array));
    }
}
