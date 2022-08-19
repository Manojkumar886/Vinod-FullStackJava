package Exception;

public class ThrowEx {
	public void checkthrow(int age)
	{
		if(age>18)
		{
		throw new ArithmeticException("not eligible for voting");
		}
		else
		{
			System.out.println("not eligible");
		}
	}

	public static void main(String[] args) 
	{
		int age=100;
		int a=10;
		int b=0;
		ThrowEx obj=new ThrowEx();
		//obj.checkthrow(age);
		if(a/b>age)
		{
		throw new ArithmeticException("Please enter your b value is not zero");	
		}
		else
		{
			System.out.println("Executed");
		}
	}

}
