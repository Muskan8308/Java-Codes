package oop;

public class staticKeyword {
	
	
	private static float pi = 3.14f;		// static data member
	
	private double circle(double r)			// non-static data member 
	{
		return pi*r*r;						// accessing static data member
	}
	
	private static double sum(int a, double b)
	{
		return a + b;
	}

	public static void main(String[] args) {

		double sum = sum(5,9.6);				// Accessing static method
		System.out.println("Sum is " + sum);
		
		staticKeyword obj1 = new staticKeyword();
		staticKeyword obj2 = new staticKeyword();

		System.out.println("Area of a circle is "+obj1.circle(2));	// output -> 12.5600 
		
		// This change will reflect in the all objects since static data members is a common data for all objects
		obj1.pi = 0;		
		
		System.out.println("Area of a circle is "+obj2.circle(4));	// output -> 0.0

	}
	
}


