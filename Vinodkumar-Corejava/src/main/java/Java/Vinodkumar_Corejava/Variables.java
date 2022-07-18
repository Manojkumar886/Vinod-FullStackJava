package Java.Vinodkumar_Corejava;

public class Variables {
	static double age=21;//static variable
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=10;  //Global Variable 
		System.out.println(age);
		String hero="Thalapathi";
		System.out.println("My favoriate hero"+hero);
		System.out.println("this is global variable is"+a);
		Variables obj=new Variables();//Object Creation
		obj.task();
		Variables obj1=new Variables();
		obj1.face();
		obj1.task();
	}
	public void task()
	{
		String name="Vinoth Kumar";//Local Variable
		System.out.println("3.30 student name is "+name);
	}
	public void face()
	{
		System.out.println("Face is very smart");
	}

}



//keywords(53 keywords in java)
//
//
//Variable:
//
//three types of variables used in java:
//
//1.static  variable
//2.local variable
//	inside method but outside class......
//
//
//3.global variable
//	Inside the class(main function)..another is instance variable
//
//
//
//method:
//method is used to perfome a particular task......
//
//syntax:
// access modifier  return type userdefined name()
//{
//fields,statment,declared
//}
//
//public void maria(arguments(parameter))
//{
//int a=10;
//sysout(a);
//}
//
//
//
//
//object:
//new-memory allocated at runtime
//syntax:
//classname objectname(udn)=new classname();
//
//example:
//Variables obj=new Variables();

