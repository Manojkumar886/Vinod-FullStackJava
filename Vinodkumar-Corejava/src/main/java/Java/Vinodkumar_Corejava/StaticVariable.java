package Java.Vinodkumar_Corejava;

public class StaticVariable {
	int rollno;
	String name;
	static String college="ksr";
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
	StaticVariable(int r,String n)
	{
		rollno=r;
		name=n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable sv=new StaticVariable(82376,"Manoj");
		sv.display();

	}

}
