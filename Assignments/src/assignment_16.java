import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class assignment_16 {

    public static void main(String[] args) {

        //even or odd

        Scanner ank = new Scanner(System.in);

        System.out.println("Please enter a integer: ");

        int input = ank.nextInt();

        int var = input % 2;
        if (var == 0) {
            System.out.println("The number is even.");
        }
        if (var != 0) {
            System.out.println("The number is odd.");
        }
    }

}
