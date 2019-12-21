/*
a default constructor
a non-default constructor with a radius as parameter
getVolume & toString
*/
public class Sphere extends CircleSolid 
{
	double radius;
	double height;
	
	public Sphere()
	{
		setRadius(0);
		setHeight(0);
	}
	public Sphere(double radius1, double height1)
	{
		setRadius(radius1);
		setHeight(height1);
	}
	public Sphere(int radius1)
	{
		setRadius(radius1);
		setHeight(radius1);
	}
	public void setRadius(double radius1) {
		radius=radius1;
	}
	public double getRadius() {
		return radius;
	}
	public double getCircumference() {
		return 2*Math.PI*radius;
	}
	public double getArea() {
		return 4*Math.PI*(radius*radius);
	}
	public String toString() {
		String word = "CircleSolid: Radius="+radius+ "\n Sphere: Volume=" + getVolume();
		return word;
	}
	public double getVolume() {
		double volume = (4./3)*Math.PI*(radius*radius*radius);
		return volume;
	}
	public void setHeight(double height1) {
		height=height1;
	}
	public double getHeight() {
		return height;
	}
}