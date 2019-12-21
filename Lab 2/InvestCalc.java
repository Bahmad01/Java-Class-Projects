import java.text.*;
public class InvestCalc
{
private double interestRate;
private double principal;
final int SHORTTERM = 5;
final int MIDDLETERM = 10;
final int LONGTERM = 20;
NumberFormat myMoneyFormat = NumberFormat.getCurrencyInstance();
DecimalFormat myFormat = new DecimalFormat("##0.00%");

  public InvestCalc()
  {
	  interestRate = 0.0;
	  principal = 0.0;
  }
  public InvestCalc( double IR, double p)
  {
	  setRate (IR);
	  setPrincipal (p);
  }
  public double getInterest()
  {
	  return interestRate;
  }
  public double getPrincipal()
  {
	  return principal;
  }
  
  public void setRate(double interest)
  {
	  if (interest >= 0.0)
	  {
		  interestRate = interest;
	  }
  }
  public void setPrincipal (double prin)
  {
	  if (prin >= 0.0)
	  {
		  principal = prin;
	  }
  }
  public String toString ()
  {
	  return ("Principal: " + myMoneyFormat.format(getPrincipal()) + " Interest Rate: " + myFormat.format(getInterest()));
  }
  public double futureValue(int year)
  {
	  double base = 1+getInterest();
	  double fValue = getPrincipal()*(Math.pow(base,year));
	  return fValue;
  }
  public void displayTable()
  {
	  System.out.println("YEAR\tINTEREST RATE\tPRINCIPAL\tFUTURE VALUE");
	  System.out.println(SHORTTERM+ "\t"+myFormat.format(getInterest())+"\t\t"+myMoneyFormat.format(getPrincipal())+"\t"+myMoneyFormat.format(futureValue(SHORTTERM)));
	  System.out.println(MIDDLETERM+ "\t"+myFormat.format(getInterest())+"\t\t"+myMoneyFormat.format(getPrincipal())+"\t"+myMoneyFormat.format(futureValue(MIDDLETERM)));
	  System.out.println(LONGTERM+ "\t"+myFormat.format(getInterest())+"\t\t"+myMoneyFormat.format(getPrincipal())+"\t"+myMoneyFormat.format(futureValue(LONGTERM)));
	  
  }
  }