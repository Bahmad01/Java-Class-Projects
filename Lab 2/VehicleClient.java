import java.util.Scanner;
public class VehicleClient
{
public static void main(String [] args)
{
    Scanner scan = new Scanner (System.in);
    System.out.println("Would you like to enter a time for a vehicle?");
    String answer = scan.next();
    int timeEntered;
    while (answer.equalsIgnoreCase("yes"))
    {
       System.out.print("Enter Time to Line for vehicle");
       timeEntered = scan.nextInt();
       Vehicle vehicle1 = new Vehicle(timeEntered);
	System.out.println("ID: " + vehicle1.getID());
	System.out.println("Time To Line: "+ vehicle1.getTimeToLine());
	System.out.println("Num Of Vehicles: "+ vehicle1.getNumOfVehicles());
	System.out.println("Time to Booth: " + vehicle1.getTimeToBooth());
	System.out.println("Time to Leave: " + vehicle1.getTimeToLeave());
	System.out.println(vehicle1.toString());
	
	
	System.out.println("Would you like to enter another time for a vehicle?"); 
        answer = scan.next();
        
	
    }
   
    
	
    
	
}
}