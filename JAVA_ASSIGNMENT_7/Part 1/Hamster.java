package assignment_7;

public class Hamster extends Rodent{
	private int lifeSpan=2;
	public Hamster() {
		System.out.println("This is a Hamster");
	}
	@Override
	void getLifeSpan() {
		// TODO Auto-generated method stub
		System.out.println("Life span of a hamster is "+lifeSpan+" year.");
	}

}
