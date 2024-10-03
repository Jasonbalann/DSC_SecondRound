import java.util.*;
public class DayNumber 
 {
  public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), year = sc.nextInt(), leap, days = 0;
    String month = "";
    
    if(year%400==0)
      leap = 1;
    else  if(year%100==0)
      leap = 0;
    else if(year%4==0)                    
      leap = 1;
    else 
      leap = 0;
	  
	if(n <= 31)
	  month = "January";
	else if(n <= ((days = 31) + 28 + leap))
	  month = "February";
	else if(n <= ((days = 31 + 28 + leap) + 31))
	  month = "March";
	else if(n <= ((days = 31 + 28 + leap + 31) + 30))
	  month = "April";
	else if(n <= ((days = 31 + 28 + leap + 31 + 30) + 31))
	  month = "May";
	else if(n <= ((days = 31 + 28 + leap + 31 + 30 + 31) + 30))
	  month = "June";
	else if(n <= ((days = 31 + 28 + leap + 31 + 30 + 31 + 30) + 31))
	  month = "July";
	else if(n <= ((days = 31 + 28 + leap + 31 + 30 + 31 + 30 + 31) + 31))
	  month = "August";
	else if(n <= ((days = 31 + 28 + leap + 31 + 30 + 31 + 30 + 31 + 31) + 30))
	  month = "September";
	else if(n <= ((days = 31 + 28 + leap + 31 + 30 + 31 + 30 + 31 + 31 + 30) + 31))
	  month = "October";
	else if(n <= ((days = 31 + 28 + leap + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31) + 30))
	  month = "November";
	else if(n <= ((days = 31 + 28 + leap + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30) + 31))
	  month = "December";
	  
	System.out.println("Date: " + (n - days) + " " + month + " " + year);
   } 
 }