
import java.io.*;

import java.util.Scanner;
public class assignment_44
{

    //Write a program to store the name and address of 10 students in file
    // and search address by given name.

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/ankitneupane/Desktop/Names.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
            System.out.println(st);
    }

}
