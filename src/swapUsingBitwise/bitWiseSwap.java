package swapUsingBitwise;

/**
 * Created by a-19-k on 1/31/19.
 */
public class bitWiseSwap {
    public static void main(String[] args) {
        int a =10, b=5;

        System.out.println("Before swaping: a="+a+";b="+b);
        a= a^b;
        b= a^b;
        a= a^b;

        System.out.println("After swaping: a="+a+";b="+b);
    }
}
