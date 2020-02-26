package assignment_7;

public class Tricycle implements ICycle{
	private String brand;
	public String getBrandName() {
		return brand;
	}

	@Override
	public void noOfTyres() {
		// TODO Auto-generated method stub
		System.out.println("Number of tyres : 3");
	}

	@Override
	public void setBrand(String b) {
		// TODO Auto-generated method stub
		brand=b;
	}
	public void display() {
		System.out.println("Tricycle :\nBrand :"+getBrandName());
		noOfTyres();
	}
}
