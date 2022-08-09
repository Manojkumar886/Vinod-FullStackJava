package Interface;

public class Connect1 implements Racing,CycleRace
{
	public static void main(String[] args) {
		Connect1 obj=new Connect1();
		obj.race();
		obj.Cyclerace();
	
		
	}

	@Override
	public void Cyclerace() {
		// TODO Auto-generated method stub
		System.out.println("Cyclerace is very bore");
	}

	@Override
	public void race() {
		// TODO Auto-generated method stub
		System.out.println("BIke race is ver interesting");
		
	}

	

}
