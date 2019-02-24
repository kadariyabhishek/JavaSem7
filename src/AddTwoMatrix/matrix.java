package AddTwoMatrix;


import java.util.Scanner;

/**
 * Created by a-19-k on 2/4/19.
 */
public class matrix {
    public static void main(String[] args) {
        int i, j, x ,y;

        Scanner in= new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of matrix");

        i= in.nextInt();  //takes no of rows
        j= in.nextInt();   //Takes no of columns

        int first[][] = new int[i][j];
        int second[][] = new int[i][j];
        int sum[][] = new int[i][j];

        System.out.println("Enter the elements of 1st matrix");

        for (x=0;x<i;x++){
            for(y=0; y<j;y++){

                first[x][y] = in.nextInt();
            }
        }

        System.out.println("Enter the elements of second matrix");

        for (x = 0 ; x < i ; x++){
            for (y= 0 ; y < j ; y++) {
                second[x][y] = in.nextInt();
            }
        }

        for (x = 0; x < i; x++) {
            for (y = 0; y < j; y++) {
                sum[x][y] = first[x][y] + second[x][y];  //replace '+' with '-' to subtract matrices
            }
        }
        System.out.println("Sum of the matrices:");

        for (x = 0; x < i; x++) {
            for (y = 0; y < j; y++) {
                System.out.print(sum[x][y] + "\t");

                System.out.println();
            }
        }
    }
}
