/*
attribute height
a default constructor
a non-default constructor with a radius and height as parameters
setHeight & getHeight
getVolume & toString

*/

public class Cylinder extends CircleSolid
{
	double radius;
	double height;
	
	public Cylinder()
	{
		setRadius(0);
		setHeight(0);
	}
	public Cylinder(double radius1, double height1)
	{
		setRadius(radius1);
		setHeight(height1);
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
		return 2*Math.PI*radius*height+2*Math.PI*(radius*radius);
	}
	public String toString() {
		String word = "CircleSolid: Radius="+radius+ "\n Cylinder: Height=" +height + " Volume=" + getVolume();
		return word;
	}
	public double getVolume() {
		double volume = Math.PI*(radius*radius)*height;
		return volume;
	}
	public void setHeight(double height1) {
		height=height1;
	}
	public double getHeight() {
		return height;
	}
}