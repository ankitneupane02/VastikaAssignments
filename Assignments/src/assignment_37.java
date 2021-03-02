public class assignment_37 {


    public static void getSum (int [][] input1, int [][] input2) {
        int rows = 3, columns = 3;
        int[][] sum = new int[rows][columns];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                sum[i][j] = input1[i][j] + input2[i][j];
            }
        }
        System.out.println();
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                System.out.print(sum[j][i] + "    ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int [][] input1 = {{1,4,7},{2,5,8},{3,6,9}};
        int [][] input2 = {{4,2,3},{5,7,1},{6,8,9}};
        System.out.println("Sum of the given matrices is: ");
        getSum(input1,input2);
    }
}
