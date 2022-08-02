package Abstraction;

public class AbstractConnection extends AbstractClass
{
	public void Elephants()
	{
		System.out.println("elephant is big animal");
	}
	public static void main(String[] args) 
	{
		AbstractClass obj=new AbstractConnection();//upcasting
		obj.Elephant();
		obj.cat();
	}
	@Override
	void Elephant() {
		// TODO Auto-generated method stub
		
	}

}
