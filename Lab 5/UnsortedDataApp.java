import java.util.Scanner;
import java.io.*;
public class UnsortedDataApp {
public static void main (String [] args) throws IOException
{
  Scanner scan = new Scanner (System.in);
  System.out.print("What is the name of the input file?");
  String fileName = scan.next();

  double [] doubles = new double [100];
  File ifile = new File (fileName);
  Scanner filescan = new Scanner (ifile);
  
   for (int i =0; i < 100; i++)
      {
         doubles[i]= filescan.nextDouble();
      }
  
   UnsortedData data = new UnsortedData();
  System.out.println("Before: " + data.countOutOfPosition(doubles));
  data.bubble(doubles);
  System.out.println("After: " + data.countOutOfPosition(doubles));
}
}
