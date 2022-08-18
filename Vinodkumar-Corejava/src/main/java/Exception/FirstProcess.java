package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstProcess {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter two number");
		try
		{
			int a=scan.nextInt();
			int b=scan.nextInt();
			System.out.println(a/b);
		}
		catch(ArithmeticException e) //RuntimeException
		{
			System.out.println(e+"Second number cannot be used zero,please enter number");
			//FirstProcess.main(args);
//			Thread.sleep(5000);
		}
		catch(InputMismatchException e1)
		{
			
			System.out.println("please enter only numberical number");
			try
			{
				Thread.sleep(5000);
			}
			catch(InterruptedException e)//compiletimeExxception
			{
				
			}
			FirstProcess.main(args);
		}
		finally
		{
			System.out.println("Thank you ");
		}
	}
}
