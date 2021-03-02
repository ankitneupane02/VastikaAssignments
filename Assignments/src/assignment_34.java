import java.util.Scanner;

public class assignment_34 {


    //Write a program to reverse the element of an array.
    public static void reverseArray(int [] input)
    {
        System.out.println();
        System.out.println("The array after reverse: ");
        for(int i = input.length-1; i>=0; i--)
        {
            System.out.print(input[i]+" ");
        }
    }

    public static void main(String[] args) {

        Scanner ank = new Scanner(System.in);

        int [] input = {1,2,3,4,5};

        System.out.println("The numbers in array are: ");
        for (int i = 0 ; i<input.length;i++)
        {
            System.out.print(input[i]+" ");
        }

        reverseArray(input);
    }
}
