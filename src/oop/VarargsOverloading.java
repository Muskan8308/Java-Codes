// VARARGS OVERLOADING
package oop;

public class VarargsOverloading {
	
	// Method 1
	static int sum(int...is)
	{
		int sum = 0;
		for(int i = 0; i < is.length; i++)
		{
			sum += is[i];
		}
		return sum ;
	}
	
	// Method 2
	static double sum(double...is)
	{
		double sum = 0;
		for(int i = 0; i < is.length; i++)
		{
			sum += is[i];
		}
		return sum;
	}
	
	// Method 3
	static int sum(int a, int...is)		// Solution for ambiguous situation - Change method name
	{
		int sum = 0;
		for(int i = 0; i < is.length; i++)
		{
			sum += is[i];
		}
		return sum + a ;
	}

	public static void main(String[] args) {

    //    System.out.println("Sum : " + sum());		// Ambiguous Situation
   //     System.out.println("Sum : " + sum(5,7,8));	// Ambiguous situation b/w M1 and M3
        System.out.println("Sum : " + sum(5.7, 8.3, 6.8));	// calls M2
	}

}
