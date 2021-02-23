public class assignment_10b {

    public static void main(String[] args) {

        // area  s (s-a) (s-b) (s-c)

        double s= 13 ;

        double a = 9 ;

        double b = 6 ;

        double c = 12 ;

        double area = s * (s - a) * (s - b) * (s - c);

        double finalResult = Math.sqrt(area);

        System.out.printf( "The area is: %.2f" ,finalResult);

    }
}
