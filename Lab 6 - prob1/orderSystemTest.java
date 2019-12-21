import java.util.Scanner;
import java.util.*;
import java.io.*;
public class orderSystemTest
{
   public static void main (String args[]) throws IOException
   {
      Order aOrder;
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter File Name: ");
      String fileName= scan.next();
      File ifile = new File (fileName);
     Scanner file = new Scanner (ifile);
     int count =0;
     while (file.hasNext())
     {
       String line;
       line = scan.nextLine();  
       count++;
        }
      
      String [] lines = new String [count];
      while (file.hasNext())
     {
       for (int i =0; i < count; i++)
       {
           lines[i] = scan.nextLine();
        }
        }
      
      for (int i=0; i < count; i++)
      {
      StringTokenizer lines1 = new StringTokenizer(lines[i],",");
	String charac = lines1.nextToken();
	String cID = lines1.nextToken();
	String pID = lines1.nextToken();
	String date = lines1.nextToken();
	String amount = lines1.nextToken();
	int oAmount = Integer.parseInt(amount);
	
	StringTokenizer date1 = new StringTokenizer(date,"/");
	String month = date1.nextToken();
	int m = Integer.parseInt(month);
	String day = date1.nextToken();
	int d = Integer.parseInt(day);
	String year = date1.nextToken();
	int y = Integer.parseInt(year);
	Date oDate = new Date (m,d,y);
	orderSystem order = new orderSystem(cID,pID, oDate, oAmount);
	//check for duplicate records

               if (!orderSystemTest.searchForDuplicate(aOrder)){
                   //create an Order object and load it on the array
                   orderSystemTest.orders.add(aOrder);
                   //System.out.println("No of order: " + myOrder.orders);
               }

               else{

                   System.out.println("Found a duplicate");
                   String out = "The Order ID is " + aOrder.getOrderID() + "\n" + "The Customer ID is " + aOrder.getCustomerID() + "\n"+"The Product ID is " + aOrder.getProductID() + "\n"+"The Date of Order is " + aOrder.getMonthOfOrder() + "/" + aOrder.getDateOfOrder() + "/" + aOrder.getYearOfOrder() + "\n"+"The Order Amount is " + aOrder.getOrderAmount();
                   System.out.println(out);
               }
           }
       }
 //sort the array
       sortString(orders);

        // User Interactive Part

        String option1;
        int option2;
        String option;
        sc = new Scanner(System.in);
        while(true)

        {
        System.out.println("Select an option:");
        System.out.println("Select \"A\" to add an order");
        System.out.println("Select \"D\" to delete an order");
        System.out.println("Select \"L\" to print out all customer IDs in file");
        option1 = sc.nextLine();

        switch(option1){
        case "A":   System.out.println("Add Order ID");
        option2 = sc.nextInt();

        System.out.println("Add Customer Order ID");
        sc.nextInt();
        System.out.println("Add Product ID");
        sc.nextInt();
        System.out.println("Add Date of Order");
        sc.nextLine();
        System.out.println("Add Order Amount");
        sc.nextInt();
        System.out.println("Type O for one-time order or R for repeater order");
        option = sc.nextLine();
        if (option.equals("R")) {
        System.out.println("Input Period");
        sc.nextInt();
        System.out.println("Input EndDate");
        sc.nextInt();

        }

    Order newOrder = new Order(/* Put information here*/);
     addOrder(newOrder);
    break;
    case "D":    System.out.println("Type an Order ID to remove");
    option2 = sc.nextInt();
     delOrder(option2);
     break;

    case "L":   print();

    ArrayList<Order> tmpOrders = new ArrayList<Order>(orders);

    tmpOrders =  sortDate(tmpOrders);

    String CustomerID = sc.nextLine();

     for (Order order : tmpOrders) {

     if (order.getCustomerID() == CustomerID)

     System.out.println(order);
     }
     break;
    }
    }
    }   

