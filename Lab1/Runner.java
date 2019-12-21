import java.util.*;
public class Runner {
  private String name;
  private int marthonTimeSeconds;
  private static final int WORLD_RECORD_TIME_SECONDS= ((2*60*60) + (3*60) + 59);// add expression to convert the record hours and minutes and seconds to seconds
  public Runner (String n, int h, int m, int s){
    name = n;
    setTime(h, m, s);
  }
  public void setTime (int h, int m, int s){
    if (h>=0 && m>=0 && s>=0) 
      marthonTimeSeconds= h*3600 + m*60 + s*1 ;// add expression to convert the h and m and s to seconds 
  }
  public String getName() { return name; }
  public int getSeconds() { return marthonTimeSeconds; }
  public double percentageSlower (){
  // ADD CODE HERE TO CALCULATE THE PERCENTAGE SLOWER THAN THE WORLD RECORD
  System.out.println(marthonTimeSeconds + " " + WORLD_RECORD_TIME_SECONDS);
  double slower = ((( (double)marthonTimeSeconds/(double)WORLD_RECORD_TIME_SECONDS)-1)*100);
    return (slower);
  }
  public Runner (String n, String data){
  // ADD CODE HERE TO INITIALIZE the object attributes by using the first String argument as the player name,
     name = n;
   
  // and by parsing the second colon-delimited String argument (hh:mm:ss) into 3 integers hours, minutes, seconds
     StringTokenizer data1 = new StringTokenizer(data,":");
	String hour = data1.nextToken();
	int h = Integer.parseInt(hour);
	String minute = data1.nextToken();
	int m = Integer.parseInt(minute);
	String second = data1.nextToken();
	int s = Integer.parseInt(second);
        setTime(h,m,s);
  }
}