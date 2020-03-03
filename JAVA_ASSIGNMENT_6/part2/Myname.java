package part2;

public class Myname {
String firstName;
String middleName;
String lastName;

	public Myname(String firstName) {
		this.firstName=firstName;
		System.out.print(firstName);
	}
	
	public Myname(String firstName, String middleName) {
		this(firstName);
		this.middleName=middleName;
		System.out.print(middleName);
	}
	
	public Myname(String firstName, String middleName, String lastName) {
		//this(firstName);
		this(firstName,middleName);
		//this.firstName=lastName;
		System.out.print(lastName);
	}
	
}
