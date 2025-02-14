// METHOD OVERLOADING : Single interface with multiple actions.
// -> In java, return-type doesn't make any difference in overloading, we have to pass either different datatype's parameters or different number of parameters.

package oop;

public class MethodOverloading {
	
	static int sum(int a, int b)		// method 1
	{
		return a + b;
	}

	static double sum(int a, double b)		// method 2
	{
		return a + b;
	}
	
	static double sum(double a, double b)		// method 3
	{
		return a + b;
	}
	
	static int sum(int a, int b, int c)		// method 4
	{
		return a + b;
	}
	
	public static void main(String[] args) {

		 System.out.println("Sum : " + sum(5,7));				// calls method 1
		 System.out.println("Sum : " + sum(4.7, 2.0));				// calls method 3
		 System.out.println("Sum : " + sum(5,91,2));				// calls method 4
		 System.out.println("Sum : " + sum(5,0.0));				// calls method 2
	}

}
