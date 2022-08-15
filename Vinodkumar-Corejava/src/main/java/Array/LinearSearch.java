package Array;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	
	public static int linearsearch(int []as,int key)
	{
		for(int i=0;i<as.length;i++)
		{
			if(as[i]==key)
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {10,200,20,130,5,290,700,50,70};
		//Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		Scanner scan=new Scanner(System.in);
		System.out.println("which number index you want");
		int key=scan.nextInt();
		System.out.println(key+"is founded by index"+linearsearch(a, key));

	}

}
