package Polymorphism;

public class Runtime02 extends Runtime01
{
	public void runtime()
	{
		System.out.println("two type of polymorphism used in java");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime02 obj=new Runtime02();
		obj.runtime();
		Runtime01 obj1=new Runtime01();
		obj1.runtime();
	}

}
