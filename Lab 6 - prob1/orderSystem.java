/*
 * The supply order classes necessary to support both non-repeated and repeated orders (use inheritance). 
 * Only basic data validation is required at this time (i.e. positive values where necessary,
 *  end date comes after order date for repeating orders).
 *  Create copy constructors for both classes (no new order ID).
 *   For any private attributes that are objects, 
 *   make sure you create a new object that is a copy of the object argument 
 *   for the set*method, 
 * and create a new object (a copy of the attribute) to return in the get* methods.
 *  orderID = O or R (onetime or repeated order), 
 *  customerID = Orange Inc. 
 *  productID = A1
 *  orderDate = 6/25/2004 
 *  orderAmount = 5 
 *  and if a repeated order, period and endDate. 
 * O,Orange Inc.,A1,6/25/2004,5
 */
public class orderSystem
{
private int orderID;
private String customerID; 
private String productID; 
private Date orderDate;
private int orderAmount;
//private orderSystem [] orders;

public orderSystem()
{
	this.customerID = " No Customer ID";
    this.productID = 0;
    this.dateOfOrder = 0;
    this.monthOfOrder = 0;
    this.yearOfOrder = 0;
    this.orderAmount = 0;
    this.orderID = 0;
}
public orderSystem(String cID, String pID, Date oD, int amount)
{
    this.customerID = customerID;
    this.productID = productID;
    this.dateOfOrder = dateOfOrder;
    this.monthOfOrder = monthOfOrder;
    this.yearOfOrder = yearOfOrder;
    this.monthOfOrder = monthOfOrder;
    this.yearOfOrder = yearOfOrder;
    this.orderAmount = orderAmount;
    this.orderID = orderID;
}

//copy constructor
public orderSystem(orderSystem os)
{
    /*this.orderID = os.orderID;
    this.customerID = os.customerID;
    this.productID = os.productID;
    this.orderDate = os.orderDate;
    this.orderAmount = os.orderAmount; */
   this(os.customerID, os.productID, os.orderDate, os.orderAmount);
}
//set ID & get
public void setOrderID(int OrderID1){
       orderID = OrderID1;
}

public int getOrderID(){
	return orderID;
}
 public int getOrderAmount()
   {
       return orderAmount;
   }
public void setCustomerID(String id){
	customerID = id;
}

public String getCustomerID(){
	return customerID;
}

public void setProductID(String pid){
	productID = pid;
}
public String getProductID(){
	return productID;
}
public void setOrderDate(Date od)
{
    orderDate = new Date (od.getMonth(), od.getDay(), od.getYear());
}
public Date getOrderDate()
{
    return orderDate;
}

      public boolean isLessThan(Order other)

   {
       if (getYearOfOrder() < other.getYearOfOrder()) {
           return true;
       }
       else if (getYearOfOrder() > other.getYearOfOrder()) {
           return false;
       }
       else if (getMonthOfOrder() < other.getMonthOfOrder()) {
           return true;
       }
       else if (getMonthOfOrder() > other.getMonthOfOrder()) {
           return false;
       }
       else if (getDateOfOrder() < other.getDateOfOrder()) {
           return true;
       }
       else if (getDateOfOrder() > other.getDateOfOrder()) {

           return false;
       }
       return true;
   }
 public String toString() {
       String print =  "The Order ID is " + this.getOrderID() + "\n"+ "the Customer ID is " + this.getCustomerID() + "\n"+"the Product ID is " + this.getProductID() + "\n"+ "The Date of Order is " + getOrderDate();
       return print;
   }

}
	 // add method to sort the array through increasing date order
       ArrayList <Order> orders;
       public void swap (ArrayList <Order> orders, int i, int j) {
           Order temp = orders.get(i);
           orders.set (i, orders.get(j));
           orders.set (j, temp);
       }

       public ArrayList <Order> sortString (ArrayList <Order> myArray) {//sort the array based on strings
           int insertPt;
           int maxIndex;

          

           for (int i = myArray.size()- 1; i >= 1; --i) {
               insertPt = i;
               maxIndex = 0;

               for (int j = 1; j <= i; ++j) {
                   //find the index with the max value in this sub array
                   if(myArray.get(maxIndex).getCustomerID().compareTo(myArray.get(j).getCustomerID()) < 0) {
                       maxIndex = j;                  
                   }
               }

               //swap values
               swap(myArray, insertPt, maxIndex);
           }
           return myArray;
       }

       public ArrayList <Order> sortDate (ArrayList <Order> myArray) {//sort the array based on date in increasing order
           int insertPt;
           int maxIndex;

           for (int i = myArray.size() - 1; i >= 1; --i) {
               insertPt = i;
               maxIndex = 0;

               for (int j = 0; j <= i; ++j) {
                   //find the index with the max value in this sub array
                   if (myArray.get(maxIndex).isLessThan(myArray.get(j))) {
                       maxIndex = j;
                   }
               }
               //swap values
               swap (myArray, insertPt, maxIndex);
           }
           return myArray;
       }

       public void searchCustomerID(String CustomerID) {
           //implement the binary search
           if (orders.size() == 0) {
               System.out.println("The office supply database is empty");
               return;
           }
           int first = 0;
           int end = orders.size() - 1;
           int mid = (first + end) / 2;

           while (first <= end) {

               if (orders.get(mid).getCustomerID().compareTo(CustomerID) == 0) {
                   System.out.println("Found a match");
                   System.out.println(orders.get(mid).toString());
                   return;

               }

               else if (orders.get(mid).getCustomerID().compareTo(CustomerID) < 0) { //look at the right half
                   first = mid + 1;
                   mid = (first + end) / 2;

               }

               else if (orders.get(mid).getCustomerID().compareTo(CustomerID) > 0) { //look at the left half
                   end = mid - 1;
                   mid = (first + end) / 2;
               }
           }
           System.out.println("No match found");
       }

       public boolean searchForDuplicate(Order aOrder) {

           //loop through the library and find duplicates

           //return true if duplicate found

           //else return false

           if(orders.size() == 0) {
               return false;
           }

          

           for (int i = 0; i < orders.size(); i++) {
               if (orders.get(i).equals(aOrder)) {
                   return true;
               }
           }
           return false;
       }

       public void addOrder (Order order) {
           orders.add(order);
       }

       public void delOrder (int orderIDToRemove) {
           for (int i = 0; i < orders.size(); i++) {
               if (orders.get(i).getOrderID() == orderIDToRemove) {
                   orders.remove(i);
                   return;
               }
           }
       }

       public void print() {//list the order
           for (int i = 0; i < orders.size(); i++) {
               System.out.println(orders.get(i).toString());
           }
       }
/*
//add an order (and assign a unique order ID)
public void addOrder(){
	
}
//delete an order (given the order ID)

public void deleteOrder(int oID){
	
}

//list all the orders for a particular customer ID in increasing date sorted order.

public void listAll(){
	
}

//calculate and report for each month on the inventory needed for each product ID based on the current supply orders

public void calculateInventory(){
	
}

}
*/
}