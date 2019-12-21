/*
leapYear()
Check if year is divisible by 4 (not a leap year)
else if it is divisile by 4 but not by 100 then it is a leap year
else if its divisible by 100, 4 , and 400 then it is a leap year
If none of the conditions are matched return it is not a leap year as a default


Set methods
setDate( int mm, int dd, int yyyy )
take in a month, day, and year.
if the year inputed is a leap year and the month inputed is 2 and the day is the 29 then set the date inputed
if their year is not a leap year and they put in 2 for the month and the day is the 29 then don't set the date inputed, and set the date to march 3
Otherwise if the above conditions aren't met just set the date inputed

setYear( int yyyy )
Check that the year is greater than or equal to 0. If it isn't then set they year to 2000 as the default using a class constant

Test Case			Expected												Tested?
2/1/-100			2/1/2000 (negative year changed to 2000, true)	 		yes
2/29/2006			3/1/2006 (not leap year, day changed to 1,false) 	 	yes
1/1/2000			1/1/2000(leap year, true) 	 							yes
2/29/2004	 	 	2/29/2004(leap year, true) 	 							yes
2/29/1900	 	 	3/1/1900(Not leap year, false) 	 						yes
2/29/1600	 		2/29/1600(leap year, true) 	 							yes
5/29/2011	 		5/29/2011(Not leap year, false) 	 					yes
2/29/2000	 		2/29/2000(leap year, true) 	 							yes
*/	 
public class DateClient
{
  public static void main( String [] args )
  {
     // add code to construct Data objects
	 Date date1 = new Date(2,1,-100); 
	 Date date2 = new Date(2,29,2006);
	 Date date3 = new Date(1,1,2000);
	 Date date4 = new Date(2,29,2004);
	 Date date5 = new Date(2,29,1900);
	 Date date6 = new Date(2,29,1600);
	 Date date7 = new Date(5,29,2011);
	 Date date8 = new Date(2,29,2000);
	 // and test and output if they are a
	 // leap year or not
	System.out.print(date1.toString()+" ");
    System.out.println(date1.leapYear(date1));
	System.out.print(date2.toString()+" ");
    System.out.println(date2.leapYear(date2));
	System.out.print(date3.toString()+" ");
    System.out.println(date3.leapYear(date3));
	System.out.print(date4.toString()+" ");
    System.out.println(date4.leapYear(date4));
	System.out.print(date5.toString()+" ");
    System.out.println(date5.leapYear(date5));
	System.out.print(date6.toString()+" ");
    System.out.println(date6.leapYear(date6));
	System.out.print(date7.toString()+" ");
    System.out.println(date7.leapYear(date7));
	System.out.print(date8.toString()+" ");
    System.out.println(date8.leapYear(date8));
  
    
    //System.out.println(date9.leapYear(date5));

  }

}