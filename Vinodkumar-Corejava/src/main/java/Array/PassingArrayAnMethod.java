package Array;

import java.util.Arrays;

public class PassingArrayAnMethod {

	public void passing(double[]arr)
	{
		System.out.println(Arrays.toString(arr));
		arr[2]=23.3;
		System.out.println(Arrays.toString(arr));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] salary= {112,4678.7,78,56.3};
		PassingArrayAnMethod pass=new PassingArrayAnMethod();
		pass.passing(salary);

	}


}
