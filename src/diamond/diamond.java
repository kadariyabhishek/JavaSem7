package diamond;

import java.util.Scanner;

/**
 * Created by a-19-k on 1/31/19.
 */
public class diamond {
    public static void main(String[] args) {

        int n=3, i, j, space = 1;
       // System.out.print("Enter the number of rows: ");
       // Scanner s = new Scanner(System.in);
       // n = s.nextInt();
        space = n - 1;
        for (j = 1; j <= n; j++)
        {
            for (i = 1; i <= space; i++)
            {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j <= n - 1; j++)
        {
            for (i = 1; i <= space; i++)
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (n - j) - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}



