package Thread;

public class ThreadCreation02  implements Runnable
{

	public static void main(String[] args) 
	{
		ThreadCreation02 th=new ThreadCreation02();
		Thread th1=new Thread(th);
		th1.start();
		

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to implements runnable interface class");
	}

}
