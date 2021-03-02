import java.util.Scanner;

public class assignment_36 {

    //Write a function to find duplicate elements in an array.

    public static void getDuplicate(int [] array)
    {
        for (int i = 0 ; i < array.length;i++)
        {
            for(int j = i + 1 ; j < array.length;j++)
            {
                if(array[i] == array[j])
                {
                    System.out.println(array[j]);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner ank = new Scanner(System.in);

        int [] array = {1,1 ,2 ,3 ,5 ,6 ,7 ,8 ,6 ,4};

        System.out.println("The duplicates are: ");

        getDuplicate(array);

    }
}
