package Array;

import java.util.Arrays;
import java.util.Scanner;

public class UpdatingAnarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] movies= {"Ghilly","Master","Bigil","Kuruvi","Varisu"};
		
		for(String values:movies)
		{
			System.out.println(values);
		}
		Scanner scan=new Scanner(System.in);
		
		System.out.println("tell us what position to update");
		int pos=scan.nextInt();
		System.out.println("place tell us what is to update/replace"+pos);
		String data=scan.next();
		movies[pos]=data;
		System.out.println(Arrays.toString(movies));
		
	}

}
