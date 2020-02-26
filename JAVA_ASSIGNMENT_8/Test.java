package assignment_8;

import java.util.*;

/*
Error Handling

Create three new types of exceptions. 
Write a class with a method that throws all three.
In main( ), call the method but only use a single catch clause that will catch all three types of exceptions. 
Add a finally clause and verify that your finally clause is executed,
even if a NullPointerException is thrown.
*/
public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence :");
		String line = sc.nextLine();
		sc.close();
		try {
			
				if(line.isEmpty())
			    	throw new EmptyStringException("No sentence found.");
			
				else {
					
					if(!Character.isUpperCase(line.charAt(0)))
					throw new FirstCharacterException("First letter of sentence must be in upper case.");
				
					char last=line.charAt(line.length()-1);
					if(last != '?' || last != '.' || last != '!')
					throw new LastCharacterException("Every statement must end with ./!/? .");			
					}
			}
		
		
		catch (Exception e) {
				// TODO Auto-generated catch block
			System.out.println("Error :"+e.getMessage());
				//e.printStackTrace();
			}
		finally {
			System.out.println("This is finally block, all possible errors are caught.");
		}
	}
}
/*
 * OUTPUT 
 * 
 * Enter a sentence :
	hello I am Haseeb
	Error :First letter of sentence must be in upper case.

	Enter a sentence :
	Hello, I am Haseeb 
	Error :Every statement must end with ./!/? .
	
	Enter a sentence :

	Error :No sentence found.
 */

