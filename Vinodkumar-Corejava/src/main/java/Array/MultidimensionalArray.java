package Array;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [][] arr=new int[4][3];//one method
		
		int [][] arr1= {{1,2},{3,4,5,6},{32,42}};
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}

	}

}
