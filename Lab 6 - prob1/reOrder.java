public class reOrder extends Order {
       private int Period;
       private int EndDate;

   // default Constructor

   public reOrder() {
       this.Period = 0;
       this.EndDate = 0;
   }

   // non-default Constructor
   public reOrder(String customerID, int productID, int dateOfOrder, int monthOfOrder,
       int yearOfOrder, int orderAmount, int orderID, int Period, int endDate) {
       super (customerID, productID, dateOfOrder, monthOfOrder, yearOfOrder, orderAmount, orderID);
       this.Period = Period;
       this.EndDate = endDate;
   }

   //Accessor Method

   public int getPeriod()
   {
       return this.Period;
   }
   public int getEndDate()
   {
       return this.EndDate;
   }
  

   //Mutator Method
   public void setPeriod(int Period)
   {
       this.Period=Period;
   }
   public void setEndDate(int endDate)
   {
       this.EndDate = endDate;
   }

   //toString Method

   public String toString() {
       String word = new String();
       word = super.toString();
       word += " Period" + this.getPeriod() + "\n";
       word += " End Date" + this.getEndDate() + "\n";
       return word;
   }
}