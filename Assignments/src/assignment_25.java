import java.util.Scanner;

public class assignment_25 {


    //Write a program that prompts the user to enter the number of students and each student’s name and score.
    // Finally display the student with the highest score.

    public static void main(String[] args)
    {

        Scanner ank = new Scanner(System.in);

        System.out.println("Enter the number of students: ");

        int numOfStudents = ank.nextInt();

        userInput(numOfStudents);

    }

    public static void userInput(int numOfStudents)
    {
        int higestScore = 0;
        String highestScoreName = "";
        for (int i = 0; i < numOfStudents; i++) {
            Scanner ank = new Scanner(System.in);
            System.out.println("Student: " + (i + 1) + "\nName: ");
            String name = ank.next();
            System.out.println("Score : ");
            int score = ank.nextInt();


            //testing the score of students

            if (score > higestScore)
            {
                higestScore = score;
                highestScoreName = name;
            }
        }

        System.out.println("Student with the highest score is: " + highestScoreName);
    }
}
