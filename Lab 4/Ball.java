public class Ball
{
private double bp;
final double private BPDEFAULT=.5;
public Ball()
{
	bp=BPDEFAULT;
}
public Ball(double bp1)
{
	setBp(bp1);
}

public void setBp(double bp1)
{
	if(bp1>=0 && bp1<1){
			bp=bp1;
	}
	
}

public double getBp()
{
	return bp;
}
//public double setHeight(double intitialht, double bp){
	
//}
public void bounceTable(double initialHeight, int bounceCount)
{
	
	double height = bp*initialHeight; 
	System.out.println("Bounce #	Height");
	System.out.println(bounceCount +"	"+ height);
}

public String toString(){
	
}
}
