package Class1;

/**
 * Created by a-19-k on 2/26/19.
 */
public class SwapWithoutThirdVariable {

        public static void main(String a[])
        {
            int x = 10;
            int y = 5;
            x = x + y;
            y = x - y;
            x = x - y;
            System.out.println("After swaping:"
                    + " x = " + x + ", y = " + y);
        }
    }


