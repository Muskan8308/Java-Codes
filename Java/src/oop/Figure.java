package oop;

// A

// INHERITANCE IMPLEMENTATION

public class Figure
{
	private final int x, y;	// Since these variables are private so we need to define some methods which return the value of these variables i.e getters and setters method.
	
	public Figure(int x, int y)
	{
		this.x = x;
		this.y = y;
		System.out.println("Inside Figure");
	}
	
	public double area()
	{
		System.out.println("Area of a figure is undefined");
		return 0;
	}
	
	// getters -> This will give you the value of instance variables
	
	public int getX()
	{
		return x;
	}
	
	// setters -> This will set the value of instance variables
	
//	public void setX(int x)
//	{
//		this.x = x;
//	}
	
	public int getY()
	{
		return y;
	}
	
//	public void setY(int y)
//	{
//		this.y = y;
//	}
	
}

class Rectangle extends Figure		// rectangle inherits figure class
{

	public Rectangle(int x, int y) {
		super(x, y);				// super keyword should be the first statement in the constructor.
		System.out.println("Inside Rectangle");
	}
	
	public double area()	// Method Overriding - Child class method's overrides the parent class method
	{
		return getX() * getY();
	}
	
}



