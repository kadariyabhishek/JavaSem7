package Class5;

/**
 * Created by a-19-k on 2/27/19.
 */
public class ThrowException {

        static void fun()
        {
            try
            {
                throw new NullPointerException("demo");
            }
            catch(NullPointerException e)
            {
                System.out.println("Caught inside fun().");
                throw e; // rethrowing the exception
            }
        }

        public static void main(String args[])
        {
            try
            {
                fun();
            }
            catch(NullPointerException e)
            {
                System.out.println("Caught in main.");
            }
        }
    }
