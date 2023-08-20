package Multithreading;

class RunnableThread1 implements Runnable
{
	public void run()
	{
		int i=0;
		while(i<10)
		{
			System.out.println("First Thread called for "+(i+1)+"th time !!!");
			i++;
		}
	}
}
class RunnableThread2 implements Runnable
{
	public void run()
	{
		int i=0;
		while(i<10)
		{
			System.out.println("Second Thread called for "+(i+1)+"th time !!!");
			i++;
		}
	}
}
class RunnableThread3 implements Runnable
{
	public void run()
	{
		int i=0;
		while(i<10)
		{
			System.out.println("Third Thread called for "+(i+1)+"th time !!!");
			i++;
		}
	}
}
public class Thread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t;
		RunnableThread1 t1 = new RunnableThread1();
		RunnableThread2 t2 = new RunnableThread2();
		RunnableThread3 t3 = new RunnableThread3();
		t = new Thread(t1);
		t.start();
		t = new Thread(t2);
		t.start();
		t = new Thread(t3);
		t.start();
	}

}
