
public class Zoning
{
    //instance variables
    private double length;
    private double width;
    //private double area;
    //class constants 
    private final double AREA1 = 2000;
    private final double AREA2 = 2500;
    private final double AREA3 = 3500;
    private final double AREA4 = 5000;
    private final double HL1 = 25;
    private final double PERCENT2 = 0.02;
    private final double HL2 = 35;
    private final double PERCENT3 = 0.01;
    private final double HL3 = 45;
    private final double PERCENT4 = 0.005;
    private final double HL4 = 52.5;
    private final double PERCENT5 = 0.0025;
   
    public Zoning()
    {
        length = 0.0;
        width= 0.0;
    }
	public Zoning(double ln, double wd)
    {
        setLength(ln);
       setWidth(wd);
    }
	public double getLength (){
		return length;
	}
	public void setLength (double ln){
		if(ln>=0)
		{
		length=ln;
		}
		else 
		length=0;
	}
	public double getWidth (){
		return width;
	}
	public void setWidth (double wd){
		if(wd>=0)
		{
		  width=wd;
		}
		else 
		 width=0;
	}
	public double getArea(){
		double area=length*width;
		return area;
	}
	public double heightLimit(){
		double limit=0.0;
		if(getArea()<=AREA1)
		{
		  limit= HL1;
		}
		else if((getArea()>AREA1 && getArea()<=AREA2))
		{
		  limit= HL1+ (PERCENT2*(getArea()-AREA1));
		}
		else if((getArea()>AREA2 && getArea()<=AREA3))
		{
		  limit= HL2+ (PERCENT3*(getArea()-AREA2));
		}
		else if((getArea()>AREA3 && getArea()<=AREA4))
		{
		  limit= HL3+ (PERCENT4*(getArea()-AREA3));
		}
		else if((getArea()>AREA4))
		{
		  limit= HL4+ (PERCENT5*(getArea()-AREA4));
		}
		return limit;
	}
	
	public int unitCountLimit(){
		int count=0;
		if(getArea()<=AREA1){
				count= 1;
		}
		else if((getArea()>AREA1 && getArea()<=AREA2)){
				count= 2;
		}
		else if((getArea()>AREA2 && getArea()<=AREA3)){
				count= 2;
		}
		else if((getArea()>AREA3 && getArea()<=AREA4)){
				count= 3;
		}
		else if((getArea()>AREA4)){
				count= 4;
		}
		return count;
	}
	
	public String toString(){
			return ("Length: " + getLength()+" Width: "+ getWidth()+" Area: "+ getArea() + "\n Height Limit: "+ heightLimit()+" Unit Count Limit: " +unitCountLimit());
	}
}