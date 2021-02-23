import java.util.Scanner;

public class Assignment_9 {
    public static void main(String[] args) {

        //convert pound into kg
        //1 pound = 0.454 kg

        Scanner ank = new Scanner(System.in);
        System.out.println("Enter the pound to convert into kg: ");

        double pound = ank.nextDouble();

        double convert = pound * 0.454 ;

        System.out.println("The answer to kg is: "+convert);




    }

}
