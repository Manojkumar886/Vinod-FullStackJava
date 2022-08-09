package Array;

import java.util.Arrays;

public class CreateAnArray {

	public static void main(String[] args) {
		int [] weight= {123,23,55,66,54,67,88};//first method to create
		int[] age=new int[10];//another method to cerate and array
		String name[]= {"Manoj","Vinod","Annamalai","Razak"};
		System.out.println(Arrays.toString(name));
			
//		for(int size=0;size<weight.length;size++)//For loop
//		{
//			System.out.println(weight[size]);
//		}
		
//		for(int values:weight)//For each Loop
//		{
//			System.out.println(values);
//		}
		System.out.println(Arrays.toString(weight));
	}

}
