public class UnsortedData {
public static int countOutOfPosition(double [] dbls)
{
	int count =0;
	
	for(int i=0; i<dbls.length ; i++)
	{
		for(int j = i+1 ; j<(dbls.length ); j++)
		{
			
			if(dbls[i]>dbls[j])
			
			{	
			  // System.out.println("this is i" + dbls[i] );
			   //System.out.println("this is j" + dbls[j] );
				count ++;
			}
		}
		
	
	}
   
	
	return count;
}
public static void bubble(double [] dbls)
{
	double [] temp = new double [dbls.length];
	
	for(int i=0; i<dbls.length-1 ; i++)
	{
		
		if (dbls[i] > dbls[i+1])
		{
                temp[i] = dbls[i+1];
		dbls[i+1] = dbls[i];
                 dbls[i] = temp[i];			
		}
	    
	}
	
	
	
	
}





}
