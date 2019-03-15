package Class3;

import java.util.function.Function;

/**
 * Created by a-19-k on 2/27/19.
 */
public class FunctionOverloading {

    public void disp(char c)
        {
            System.out.println(c);
        }
    public void disp(char c, int num)
    {
        System.out.println(c + " "+num);
    }
}
class Sample
{
    public static void main(String args[])
    {
        FunctionOverloading obj = new FunctionOverloading();
        obj.disp('a');
        obj.disp('a',10);
    }
}

