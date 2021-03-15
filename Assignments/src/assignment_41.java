import java.util.Scanner;

public class assignment_41 {

    //Write a program to find the duplicate letter in a word.

    public static void findDuplicate (String input)
    {
        char [] array = input.toCharArray();
        for (int i = 0 ; i < input.length() ; i++)
        {
            for (int j = i +1 ; j < input.length();j++)
            {
                if(array[i] == array[j])
                {
                    System.out.println(array[j]+" ");
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {

        Scanner ank = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String input = ank.next();

        System.out.println("The duplicate characters in the string are: ");

        findDuplicate(input);
    }
}
