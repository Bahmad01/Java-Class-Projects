public class DailySales{
private int sales;
private int currentSale;
private int numDays; 
private int [] salesperDay;
public DailySales()
{
	
	numDays = 31;
	sales=0;
	currentSale=0;
}

public DailySales (int daysInMonth){
	numDays = daysInMonth;
	sales=0;
	currentSale=0;
}

public boolean addSales(int dayNumber, int sales){
    if (sales > 0)
    {
    salesperDay[dayNumber] = salesperDay[dayNumber] + sales;
    return true;
    }
    return false;
}

public int maxDay(){
    int max = 0;
    for (int i = 0; i < salesperDay.length; i++)
    {
        for (int j=i+1; j< (salesperDay.length); j++)
        if (salesperDay[i] > salesperDay[j])
        {
            max = i;
        }
    }
    return max;
}

public int[] daysBelowGoal(){
	int count = 0;
	for (int i = 0; i < salesperDay.length; i++)
    {
        
        if (salesperDay[i] < 100)
        {
            count++;
        }
    }
    int [] lessthan100 = new int [count];
    for (int i = 0; i < salesperDay.length; i++)
    {
        if (salesperDay[i] < 100)
        {
            lessthan100[i] += salesperDay[i];
        }
    }
    return lessthan100;
}
}