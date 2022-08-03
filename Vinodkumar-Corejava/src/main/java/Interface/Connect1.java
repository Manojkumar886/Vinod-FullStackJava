package Interface;

public class Connect1 implements Racing
{
	public static void main(String[] args) {
		Connect1 obj=new Connect1();
		obj.race();
		
	}

	@Override
	public void race() {
		// TODO Auto-generated method stub
		System.out.println("i am Racer");
	}

}
