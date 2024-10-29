package pkg1;
class MultiThreadingThree extends Thread
{
    public void run()
    {
        int i;
        for(i=0;i<5;i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                
            }
        }
    }
}
public class J13
{
    public static void main(String[] args)
    {
        MultiThreadingThree mt1=new MultiThreadingThree();
        mt1.start();
    } 
}
