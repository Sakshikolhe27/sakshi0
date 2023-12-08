

class Demo extends Thread
{
	public void run()
	{
		for(int i=1; i<=20; i++)
		{
			System.out.print("D" + i);
		}
	}
}

class INTERFACE {

	public static void main(String[] args) {
		Demo t = new Demo();
		t.start();
          for(int i=1; i<=20; i++)
          {
        	  System.out.print("M" + i);
          }
	}

}
