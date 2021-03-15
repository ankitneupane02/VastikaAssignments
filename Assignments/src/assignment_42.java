import java.util.Scanner;

public class assignment_42
{

    //Write a program to find the duplicate word from a long string.

    public static void findDuplicate (String input)
    {
        input = input.toLowerCase();

        int count ;

        String[] words = input.split(" ");

        for (int i = 0 ; i < words.length;i++)
        {
            count = 1 ;
            for(int j = i +1 ; j < words.length;j++)
            {
                if(words[i].equals(words[j]))
                {
                    count++;
                    words[j] = "0";
                }
            }

            if(count > 1 && words[i] != "0")
            {
                System.out.println(words[i]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner ank = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String input = ank.next();
        System.out.println();
        System.out.println("The duplicate words in the given sentence are: ");
        findDuplicate(input);
    }
}
