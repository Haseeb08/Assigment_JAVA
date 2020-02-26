package assignment_7;

/*
 * 1. Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,etc.
 *  In the base class, provide methods that are common to all Rodents,
 *   and override these in the derived classes to perform different behaviors depending on the specific type of Rodent.
 *    Create an array of Rodent, fill it with different specific types of Rodents,
 *     and call your base-class methods to see what happens.
 *  Make the methods of Rodent abstract whenever possible and all classes
 *   should have default constructors that print a message about that class.
 */
public class Main {

	public static void main(String[] args) {
	int n=2;
	Rodent[] rodents=new Rodent[n];
	Rodent mouse1=new Mouse();
	Rodent hamster1=new Hamster();
	
	rodents[0]=mouse1;
	rodents[1]=hamster1;
	
	for(int i=0;i<n;i++) {
	rodents[i].getFamily();
	rodents[i].getLifeSpan();
	}
}
}

/*
	OUTPUT
	This is a mouse
	This is a Hamster
	Family : Rodent.
	Life span of a house mouse is 1 year.
	Family : Rodent.
	Life span of a hamster is 2 year.

*/