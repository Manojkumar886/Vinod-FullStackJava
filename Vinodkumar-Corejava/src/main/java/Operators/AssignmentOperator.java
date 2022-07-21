package Operators;

//AssignmentOperator
//only assigned for extra values in particular variables
//same as arithemetic operator...(proxess using = keyword)
public class AssignmentOperator 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=100;
		int c=a+b;
		b+=5;///additional assignment operator
		c-=10;
		a*=100;
		a/=90;
		System.out.println("A value is "+a);
		System.out.println("B value is"+b);
		System.out.println("C value is"+c);
		
		
	}

}
