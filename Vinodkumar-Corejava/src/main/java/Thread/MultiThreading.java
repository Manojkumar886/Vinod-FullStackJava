package Thread;

public class MultiThreading {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 
//		Runnable game=new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("Welcome to runnable");
//			}
//		};
//		
		player play=new player();
		Thread t1=new Thread(play);
		t1.start();
		player1 p1=new player1();
		t1.setName("First Thread");
		System.out.println(t1.getName());
		System.out.println(p1.getName());
		System.out.println(t1.getId());
		p1.start();
		p1.join();
		t1.join();

		System.out.println("Thank you");
		
		
	}

}
class player implements Runnable
{

	@Override
	public void run() 
	{
		for(int i=0;i<4;i++)
		{
			System.out.println("Welcome to Thread Concept");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}

class player1 extends Thread
{
	public void run()
	{
	for(int i=0;i<=10;i++)
	{
		System.out.println(i);
		
	}
	}
	
}
