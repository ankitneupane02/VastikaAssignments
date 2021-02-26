import java.util.Scanner;

public class assignment_21 {

    // Program to input the number of (1...7) and
    // translate to its equivalent name of the day of the week.

    public static void daysOfWeek (int a)
    {
        switch(a)
        {
            case 1 :
                System.out.println("The day is Monday.");
                break;
            case 2 :
                System.out.println("The day is Tuesday.");
                break;
            case 3 :
                System.out.println("The day is Wednesday.");
                break;
            case 4 :
                System.out.println("The day is Thursday.");
            case 5 :
                System.out.println("The day is Friday.");
                break;
            case 6 :
                System.out.println("The day is Saturday.");
                break;
            case 7 :
                System.out.println("The day is Sunday.");
                break;
            default:
                System.out.println("Invalid Input.");
        }

    }

    public static void main(String[] args) {

        Scanner ank = new Scanner(System.in);

        System.out.println("Enter a digit from 1 to 7 : ");

        int a = ank.nextInt();

        daysOfWeek(a);
    }
}
