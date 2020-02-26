/*Assignment - 9
 * Using the documentation for java.util.regex.Pattern as a resource, 
 * write and test a regular expression that checks a sentence to see that it begins with a capital letter and ends with a period.
 */
package assignment_9;
import java.util.*;
import java.util.regex.*;

public class PatternMatch {

	public static boolean matchSentence(String sentence) {
		Pattern p = Pattern.compile("^[A-Z].*[.]$");//. represents a sentence starting with Capital letter and ending with period. 
		Matcher m = p.matcher(sentence);
		return m.matches();
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter a sentence : ");
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		sc.close();
		
		if(matchSentence(input)) 
		System.out.println("The above sentence begins with a capital letter and ends with a period."); 
		else 
			System.out.println("The above sentence does not begins with a capital letter and ends with a period."); 

	}
}

/*OUTPUT
 * 
 * Enter a sentence : 
	This sentence starts with a Capital letter and ends with a period.
	The above sentence begins with a capital letter and ends with a period.

* Enter a sentence : 
 	this sentence does not start with a Capital letter and ends with a period.
	The above sentence does not begins with a capital letter and ends with a period.
 */
