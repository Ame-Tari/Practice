package syc;

/**
 * @author ametrin
 */
public class ThreadDomain18
{
    public void doLongTimeTask() throws Exception
    {
        for (int i = 0; i < 100; i++)
        {
            System.out.println("nosynchronized threadName = " +
                    Thread.currentThread().getName() + ", i = " + (i + 1));
        }
        System.out.println();
        synchronized (this)
        {
            for (int i = 0; i < 100; i++)
            {
                System.out.println("synchronized threadName = " +
                        Thread.currentThread().getName() + ", i = " + (i + 1));
            }
        }
    }


    public static void main(String[] args) {
        Thread thread = new Thread();



    }
}