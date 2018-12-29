package ThreadExample;


public class TaskThreadDemo
{
	public static void main(String[] args)
	{
		// Create tasks
		Runnable printA = new PrintSign('a', 100);
		Runnable printB = new PrintSign('b', 100);
		Runnable printC = new PrintSign('c', 100);

		// Create threads
		Thread thread1 = new Thread(printA, "Thread1");
		Thread thread2 = new Thread(printB, "Thread2");
		Thread thread3 = new Thread(printC, "Thread3");

		// Start threads
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
