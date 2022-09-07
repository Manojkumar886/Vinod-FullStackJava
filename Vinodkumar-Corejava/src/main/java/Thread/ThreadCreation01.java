package Thread;

public class ThreadCreation01 extends Thread
{
//	public void connect()
//	{
//		System.out.println("Welcome to thread");
//	}
	public void run()
	{
		System.out.println("Welocme to thread class");
	}
//	public void start()
//	{
//		System.out.println("Connection");
//	}

	public static void main(String[] args) 
	{
	
		ThreadCreation01 th=new ThreadCreation01();
		th.start();
//		th.connect();
	}

}
