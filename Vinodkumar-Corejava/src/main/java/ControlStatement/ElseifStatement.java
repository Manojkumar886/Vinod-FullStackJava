package ControlStatement;
//if(condition){}else if(condition){}else if(conditon){}else{};
public class ElseifStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=9;
		String city="Tamilnadu";
		if(city=="Kerala")
		{
			System.out.println("Kerala is nature State");
		}
		else if(city=="Tamilnadu")
		{
			System.out.println("Tamilnadu is Political State");
		}
		else if (a>b)
		{
			System.out.println("a is greater then of b");
		}
		else 
		{
			System.out.println("City is not available");
		}
				

	}

}
