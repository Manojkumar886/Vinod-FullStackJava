package Polymorphism;

public class CompileTimePoly {
	
	public void compile()
	{
		System.out.println("compile is nothing but its overloading");
	}
	public void compile(float a)
	{
		System.out.println("compile-compile -compile");
	}
	public void compile(double b)
	{
		System.out.println("obverloading-overloading-overloading");
	}

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		CompileTimePoly poly=new CompileTimePoly();
		poly.compile();
		poly.compile(3.4f);
		poly.compile(40.0);

	}

}
