package UML;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class KYCmain {  
public static void main(String[] args)throws Exception {  
	int n;
	Scanner sc=new Scanner(System.in);
	//take n strings as input
	n=sc.nextInt();
	String[] signUpDates=new String[n];
	String[] currDates=new String[n];
	for(int i=0;i<n;i++)
	{
		signUpDates[i]=sc.next();
		currDates[i]=sc.next();
	}
   // String signUpDate="16-07-1998";  
    //String currDate="27-06-2017"; 
    KYCmain k=new KYCmain();
    for(int i=0;i<n;i++) {  
    String range=FindKycRange.findRange(signUpDates[i], currDates[i]);
      k.displayRange(range);	
	}
} 
	public void displayRange(String range) {	
		System.out.println(range);	
	}
}  