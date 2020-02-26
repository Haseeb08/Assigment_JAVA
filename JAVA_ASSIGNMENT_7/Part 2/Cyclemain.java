package assignment_7;

public class Cyclemain {

	public static void main(String[] args) {
	Unicycle unicycle=new Unicycle(); //Upcasting
	Bicycle bicycle=new Bicycle();
	Tricycle tricycle=new Tricycle();
	
	
    Cycle[] cycles=new Cycle[3];
    								//Upcasting : Casting of subtype into a supertype
    cycles[0]=(Cycle)bicycle;
    cycles[1]=(Cycle)unicycle;
    cycles[2]=(Cycle)tricycle;

    for(int i=0;i<3;i++){
        cycles[i].getBrandName();
       // cycles[i].balance(i);
        
         /*
         * The above statement gives above error because Cycle class do not have balance() method.
         */
    }
    
    
    Cycle c1=new Bicycle();
    Cycle c2=new Unicycle();
    Cycle c3=new Tricycle();

                                            // Downcasting : Casting of supertype to a subtype.
    Bicycle bicycle2=(Bicycle) c1;
    Unicycle unicycle2=(Unicycle) c2;
    Tricycle tricycle2=(Tricycle) c3;

    
    bicycle2.getBrandName();
    bicycle2.balance();

    
    unicycle2.getBrandName();
    unicycle.balance();


    tricycle2.getBrandName();
   // tricycle1.balance();

    /*
     * The above statement gives above error because TriCycle class do not have balance() method.
     */
	}
}
