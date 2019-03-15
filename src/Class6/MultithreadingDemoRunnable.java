package Class6;

/**
 * Created by a-19-k on 2/27/19.
 */

public class MultithreadingDemoRunnable implements Runnable
{
    public void run()
    {
        try
        {
            // Displaying the thread that is running 
            System.out.println ("Thread " +
                    Thread.currentThread().getId() +
                    " is running");

        }
        catch (Exception e)
        {
            // Throwing an exception 
            System.out.println ("Exception is caught");
        }
    }
}

// Main Class
class Multithread2
{
    public static void main(String[] args)
    {
        int n = 8; // Number of threads 
        for (int i=0; i<8; i++)
        {
            Thread object = new Thread(new MultithreadingDemo());
            object.start();
        }
    }
} 