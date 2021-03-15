public class assignment_43 {

    //Write a program to trap the exception handling to
    // trap the divided by zero and out of index value in array.

    public static void main(String[] args)
    {
        getArrayException();
        getNumberException();
    }

    public static void getArrayException()
    {
        try
        {
            int a[] = new int[10];
            a[11] = 9;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds.");
        }
    }

    public static void getNumberException()
    {
        try
        {
            int num1 = 30, num2 = 0;
            int output = num1 / num2;
            System.out.println("Result: " + output);
        }
        catch (ArithmeticException e)
        {
            System.out.println("You shouldn't divide by 0");
        }
    }

}


