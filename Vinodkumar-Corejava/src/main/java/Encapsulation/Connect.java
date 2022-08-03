package Encapsulation;

public class Connect {
	public void run()
	{
		System.out.println("Encapsulation is running:");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connect obj=new Connect();
		obj. run();
		Checking ck=new Checking();
		ck.setName("Vinod Kumar");
		System.out.println("My name is :"+ck.getName());
		ck.setAge(22);
		System.out.println("My age is :"+ck.getAge());

	}

}
