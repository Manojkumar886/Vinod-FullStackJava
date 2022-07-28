package Constructor;

//this keyword is used to referenced variables is refer to the current object
public class ParaConstructor {
	int age;
	String gender;
	double salary;
	public ParaConstructor(String gender,double incentive)
	{
		this.gender=gender;
		salary=incentive;
		System.out.println(gender+" "+salary);
	}
	public ParaConstructor(int age,String gender)
	{
		this.age=age;
		this.gender=gender;
		System.out.println("Age is "+age);
		System.out.println("Gender is"+gender);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParaConstructor obj=new ParaConstructor(21, "Male");
		new ParaConstructor("Vinod", 80000);
	}

}
