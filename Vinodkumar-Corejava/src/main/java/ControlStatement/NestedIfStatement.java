package ControlStatement;
//if(con) statementif(con)else{}
public class NestedIfStatement {

	public static void main(String[] args) 
	{
		double a=89;
		double b=78;
		double c=456;
		if(a<b)
		{
			if(c>a)
			{
				System.out.println("C is greater then of a");
			}
		}
		else
		{
			System.out.println("Nothing is permanent");
		}
		

	}

}
