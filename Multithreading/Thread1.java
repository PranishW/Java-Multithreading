package Multithreading;

class FirstThread extends Thread
{
	public void run()
	{
		int i=0;
		while(i<=10)
		{
			System.out.println("First Thread called for "+(i+1)+"th time !!!");
			i++;
		}
	}
}
class SecondThread extends Thread
{
	public void run()
	{
		int i=0;
		while(i<=10)
		{
			System.out.println("Second Thread called for "+(i+1)+"th time !!!");
			i++;
		}
	}
}
class ThirdThread extends Thread
{
	public void run()
	{
		int i=0;
		while(i<=10)
		{
			System.out.println("Third Thread called for "+(i+1)+"th time !!!");
			i++;
		}
	}
}
public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstThread t1 = new FirstThread();
		SecondThread t2 = new SecondThread();
		ThirdThread t3 = new ThirdThread();
		t1.start(); 	// from Thread class
		t2.start();		// to start execution of thread
		t3.start();		// automatically calls run method that is overridden
	}

}
