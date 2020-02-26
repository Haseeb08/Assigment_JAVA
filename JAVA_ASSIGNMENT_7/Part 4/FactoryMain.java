package assignment_7;

/* TASK :
 *  Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle.
 *  Create factories for each type of Cycle, and code that uses these factories.
 */

public class FactoryMain {

	public static void main(String[] args) {
		Unicyclefactory uf=new Unicyclefactory();
		uf.makeCycle();
	
		BicycleFactory bf=new BicycleFactory();
		bf.makeCycle();
		
		Tricyclefactory tf=new Tricyclefactory();
		tf.makeCycle();
		
	}
}

/*
	OUTPUT
	
Unicycle :
Brand :Avon
Number of tyres : 1

Bicycle :
Brand :Hero
Number of tyres : 2
T
ricycle :
Brand :Hercules
Number of tyres : 3


*/