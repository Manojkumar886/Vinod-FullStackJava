package Array;

import java.util.Arrays;
import java.util.Scanner;

public class InsertingAnarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] Temple=new String[10];//another method of array creation
		Scanner scan=new Scanner(System.in);
		
		for(int index=0;index<Temple.length;index+=2)
		{
			System.out.println("Enter the Your name");
			Temple[index]=scan.next();
		}
		System.out.println(Arrays.toString(Temple));
		scan.close();
	}

}
