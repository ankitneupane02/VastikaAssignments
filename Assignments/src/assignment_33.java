import java.util.Scanner;

public class assignment_33 {


    //Write a Program to display numbers in ascending
    // order in array.
    public static void getAssendingArray(int [] array)
    {
        int temp = 0;
        for (int i = 0 ; i < array.length ; i++)
        {
            System.out.print(array[i] + " ");
        }
        for (int i = 0 ; i < array.length;i++)
        {
            for(int j = 0 ; j < array.length;j++)
            {
                if(array[i] < array[j])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner ank = new Scanner(System.in);

        int  [] array = {1, 6, 8 ,10,2,5,22};

        System.out.println("Elements in the array: ");

        getAssendingArray(array);

        System.out.println("Numbers in array in ascending order: ");

        for(int i = 0 ; i< array.length;i++)
        {
            System.out.print(array[i]+" ");
        }

    }
}
