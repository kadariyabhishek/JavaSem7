package swapValue;

import javax.xml.bind.SchemaOutputResolver;

/**
 * Created by a-19-k on 1/31/19.
 */
public class SwapUsingTemp {
    public static void main(String[] args) {

        int a= 20, b=10;

        System.out.println("Before swaping: a="+a+"; b="+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After swaping: a="+a+",b="+b);
    }
}
