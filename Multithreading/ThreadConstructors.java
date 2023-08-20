package Multithreading;

class ExtendedThread extends Thread
{
	ExtendedThread(String name)
	{
		super(name);
	}
	public void run()
	{
		int i=0;
		while(i<20)
		{
			System.out.println("run() method from First Thread extending "
					+ "Thread Class called ");
			i++;
		}
	}
}
class RunnableThread implements Runnable
{
	public void run()
	{
		int i=0;
		while(i<20)
		{
			System.out.println("run() method from Second Thread implementing "
					+ "Runnable interface called");
			i++;
		}
	}
}
public class ThreadConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendedThread t1 = new ExtendedThread("Thread1");
		RunnableThread t2 = new RunnableThread();
		Thread t = new Thread(t2,"Thread2");
		System.out.println("Id of First Thread is :- "+t1.getId());
		System.out.println("Id of Second Thread is :- "+t.getId());
		System.out.println("Name of First Thread is :- "+t1.getName());
		System.out.println("Name of Second Thread is :- "+t.getName());
		t1.start();
		t.start();
	}

}
