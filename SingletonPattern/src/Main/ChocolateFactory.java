package Main;

import static Main.ChocolateBoiler.getInstanceChocolateBoiler;

public class ChocolateFactory 
{
    public static void main(String[] args) 
    {
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        
        thread1.start();
        thread2.start();
    }
    
    public static class Thread1 implements Runnable
    {
        @Override
        public void run() 
        {
            ChocolateBoiler chocolateBoiler = getInstanceChocolateBoiler();
            System.out.println("Thread1 created");
            
            chocolateBoiler.fill();
            chocolateBoiler.boil();
            chocolateBoiler.drain();
        }
    }
    
    public static class Thread2 implements Runnable
    {
        @Override
        public void run() 
        {
            ChocolateBoiler chocolateBoiler = getInstanceChocolateBoiler();
            System.out.println("Thread2 created");
            
            chocolateBoiler.fill();
            chocolateBoiler.boil();
            chocolateBoiler.drain();
        }
    }
}
