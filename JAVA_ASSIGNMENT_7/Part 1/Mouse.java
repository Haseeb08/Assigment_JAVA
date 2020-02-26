package assignment_7;

public class Mouse extends Rodent{
	private int lifeSpan=1;
	
	public Mouse() {
		System.out.println("This is a mouse");
	}
	@Override
	void getLifeSpan() {
		// TODO Auto-generated method stub
		System.out.println("Life span of a house mouse is "+lifeSpan+" year.");
	}


}
