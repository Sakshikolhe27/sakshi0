// Write a java program to explain Multithreading implementing Runnable interface
class A implements Runnable
{ 
   public void run()
       {
           for(int i=0; i<=20; i++)
             {
                   System.out.print("A"  +  i);
             }     
       }
}

class Program
{
     public static void main(String[] ars)
     {
            A target = new A();
            Thread t = new Thread(target);
           t.start();
             for(int i=1; i<=20; i++)
             {
                   System.out.print("M" + i);
             }
     }
}
