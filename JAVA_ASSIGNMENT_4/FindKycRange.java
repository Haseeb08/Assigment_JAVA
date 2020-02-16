package UML;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FindKycRange {

	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	public static String findRange(String signUpDate,String currDate) throws Exception {
		 
		FindKycRange d=new FindKycRange();
		
		Date signUPD=d.parseStringToDate(signUpDate);                       //Parse string to Date
	    Date currD=d.parseStringToDate(currDate);  
		  if(signUPD.after(currD))
		    	return "No range";
		    else 
		    return d.getRange(currDate, d, signUPD, currD);   
		   }
	
	private String getRange(String currDate, FindKycRange d, Date signUPD, Date currD) throws Exception {
		int currYear;
		if(signUPD.getYear()==currD.getYear())
			currYear=signUPD.getYear()+1;
		else 
			currYear=currD.getYear();
		
		signUPD.setYear(currYear);
	
		Date kycDate1 =d.modifyDays(signUPD,-30);                                        
		Date kycDate2 =d.modifyDays(signUPD,30);
		
		String kd1 = d.parseDateToString(kycDate1);              //Parse Date to String
		String kd2 = d.parseDateToString(kycDate2);

			if(currD.after(kycDate1)&&currD.before(kycDate2))
				return kd1+" "+currDate;
			else
				return kd1+" "+kd2;
	}
	public Date parseStringToDate(String strDate) throws Exception {
		return sdf.parse(strDate);	
	}
	public String parseDateToString(Date date) throws Exception {
		return sdf.format(date.getTime()); 
	}
	public Date modifyDays(Date d,int days)
	{
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(d);
		cal.add(Calendar.DATE, days);	
		return cal.getTime();
	}
}
