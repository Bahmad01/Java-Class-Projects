import java.util.Scanner;

public class ZoningApp
{
    public static void main (String args [])
    {
    Scanner scan = new Scanner (System.in);
    System.out.println("Would you like to enter your lot length and width?");
    String answer = scan.next();
    double l,w;
    //getting input from the user to continue checking data
    Zoning DefaultZone = new Zoning();  //checking default constructor 
    System.out.println("Default Zone Created: \n" + DefaultZone.toString());
    while (answer.equalsIgnoreCase("yes"))
    {
       System.out.print("Enter your lot length: ");
       l = scan.nextDouble();
       System.out.print("Enter your lot width: ");
       w = scan.nextDouble();
       Zoning zone = new Zoning(l,w);  //checking user entered data for non default constructor
	
	System.out.println("Object changed: " + zone.toString());
	
	
	System.out.println("Would you like to enter another length and width for your lot?"); 
        answer = scan.next();
        
	
    }
}
}
