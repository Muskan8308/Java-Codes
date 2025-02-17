package oop;

// A

public class Triangle extends Figure{
	
	Triangle(int x, int y)
	{
		super(x, y);
	}

	public double area()
	{
		return (getX() * getY())/2.0;
	}
}
