/*
attribute radius
a default constructor
a non-default constructor with a radius as parameter
setRadius & getRadius & getCircumference & getArea & toString
an abstract method getVolume

*/
public abstract class CircleSolid
{
	private double radius;
	public CircleSolid()
	{
		radius=0;
	}
	public CircleSolid(double radius1)
	{
		setRadius(radius1);
	}
	public abstract void setRadius(double radius1);
	public abstract double getRadius();
	public abstract double getCircumference();
	public abstract double getArea();
	public abstract String toString();
	public abstract double getVolume();
}