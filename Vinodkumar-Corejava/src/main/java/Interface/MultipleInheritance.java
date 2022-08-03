package Interface;

public class MultipleInheritance implements CycleRace,Racing
{
	public void racing()
	{
		System.out.println("two racing is my fav,one is cycle ,another one Bike");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance multi=new MultipleInheritance();
		multi.Cyclerace();
		multi.race();
		multi.racing();

	}

	@Override
	public void race() {
		// TODO Auto-generated method stub
		System.out.println("Vinod is Bike Racer");
	}

	@Override
	public void Cyclerace() {
		// TODO Auto-generated method stub
		System.out.println("manoj is Cycle racer in hilldown game");
		
	}

}
