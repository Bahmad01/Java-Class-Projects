public class Vehicle
{
private int ID;
private int timeToLine;
private int timeToBooth;
private int timeToLeave;
static private int numOfVehicles;
//assumptions: TimetoBooth is original time + 3, TimetoLeave is original time +5

public Vehicle(int time)
{
	ID = getNumOfVehicles()+1;
	setTimeToLine(time);
	setTimeToBooth(time+3);
	setTimeToLeave(time+5);
	numOfVehicles++;
}
public int getID()
  {
	  return ID;
  }
  
 public int getTimeToLine()
  {
	  return timeToLine;
  }
  
  public void setTimeToLine(int time)
  {
	  if (time>0) 
	  timeToLine=time;
	  else 
	  timeToLine=0;
  }
 public int getTimeToBooth()
  {
	  return timeToBooth;
  }
  
  public void setTimeToBooth(int time)
  {
	if (time-3>0 && getTimeToLine()<=time) 
	timeToBooth=time;
	else 
	timeToBooth=0;
  }
  public int getTimeToLeave()
  {
	  return timeToLeave;
  }
  
  public void setTimeToLeave(int time)
  {
	if (time-5>0 && getTimeToBooth()<time) 
	timeToLeave=time;
	else 
	timeToLeave=0;
	  
  }
 public int getNumOfVehicles()
  {
	  return numOfVehicles;
  }
  public String toString ()
  {
	  return ("Time to Line: " + getTimeToLine() + " Time to Booth: " + getTimeToBooth() +" Time to Leave: "+ getTimeToLeave());
}
}