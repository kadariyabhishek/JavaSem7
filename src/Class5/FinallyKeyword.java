package Class5;

/**
 * Created by a-19-k on 2/27/19.
 */
public class FinallyKeyword {
    public static void main(String[] args)
    {
        // a final reference variable sb
        final StringBuilder sb = new StringBuilder("Heiki");

        System.out.println(sb);

        // changing internal state of object
        // reference by final reference variable sb
        sb.append("ForHeiki");

        System.out.println(sb);
    }
}
