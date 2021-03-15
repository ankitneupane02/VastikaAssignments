import java.util.Scanner;

public class assignment_39
{
    // Write a Program to display names in short form. E.g. Ram Kishore Singh  -> R. k. Sing

    public static void main(String[] args)//main method declaration
        {
            System.out.println("----------Print the initial name----------");
            System.out.println("Please enter the full name of the user");//prompt user to  input
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();//take name input from user
            name(name);

        }
        public static void name(String name) //name method declaration
        {
            int last = name.lastIndexOf(" ");//calculate index
            System.out.print(name.charAt(0) +".");//print the ist letter of initial name
            for (int i=0; i<last; i++)//for loop
            {
                char ch = name.charAt(i);//assign character
                if(ch ==' ')
                {
                    System.out.print(name.charAt(i+1)+ ".");//print the result

                }

            } System.out.println(name.substring(last+1));//print the last name
        }
    }