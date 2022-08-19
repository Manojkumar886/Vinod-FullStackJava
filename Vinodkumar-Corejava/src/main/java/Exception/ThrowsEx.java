package Exception;

import java.io.File;
import java.io.IOException;

public class ThrowsEx {

	public static void main(String[] args) throws InterruptedException, IOException ,ArithmeticException
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int a=10;
		int b=0;
//		File file=new File("");
//		file.createNewFile();
		try
		{
			System.out.println(a/b);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("worked in exception");
		}
		Thread.sleep(9000);
		
	}

}
