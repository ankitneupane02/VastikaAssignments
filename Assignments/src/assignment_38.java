import java.util.Scanner;

public class assignment_38 {

    //Write a program to check whether a given string is palindrome or not
    public static boolean isPalindrome (String input)
    {
        int i = 0 ;
        int j = input.length() - 1 ;

        while( i < j) {
            if (input.charAt(i) != input.charAt(j))
                return false;
                i++;
                j--;
            }
            return true ;
        }
    public static void main(String[] args) {

        Scanner ank = new Scanner(System.in);

        System.out.print("Enter the string: ");

        String input = ank.next();
        System.out.println();
        if(isPalindrome(input))
        {
            System.out.println("The given string is palindrome.");

        }
        else
            {
            System.out.println("The given string is not a palindrome.");
        }
    }
    }

