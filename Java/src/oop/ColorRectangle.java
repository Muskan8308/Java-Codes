package oop;

// A 

public class ColorRectangle extends Rectangle{
	
	private final String color;
	
	public ColorRectangle(int x, int y, String color)
	{
		super(x,y);
		this.color = color;
		System.out.println("Inside ColorRectangle");
	}
	
	public String getC()
	{
		return color;
	}
	
	public double area()
	{
		double area = super.area();			// To use previous defined method we use super keyword, this will implements it's just one level upper area method. 
		System.out.println("Testing");		// Add some lines which you want to do in this method.
		return area;
	}

}
