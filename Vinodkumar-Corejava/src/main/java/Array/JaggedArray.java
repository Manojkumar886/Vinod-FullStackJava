package Array;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]=new int[2][];//jagged array
		arr[0]=new int[3];//first row in three colums
		arr[1]=new int[4];//second row in four colums
		int count=0;
		//value assumtion
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=count+=1;
			}
		}
		
		//jagged array
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)//jagged array
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
