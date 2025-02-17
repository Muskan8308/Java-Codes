// 1. variable length parameter should be the last parameter in the method. 
package oop;

import java.util.Arrays;
public class varargs2 {
	// it returns the sum of all arguments
	static int sum(int a, int...is)
	{
		int sum = 0;
		for(int i = 0; i < is.length; i++)
		{
			sum += is[i];
		}
		return sum + a ;
	}
	
	// It returns the new array in which every element will be the multiple of 10;
	static double[] pro(double...ds)
	{
		double[] arr = new double[ds.length];
		int x = 0;
		for(int i = 0; i < ds.length; i++)
		{
			arr[x] = ds[i] * 10; 
			x++;
		}
		return arr;
	}

	public static void main(String[] args) {

		System.out.println("Sum of the elements : " + sum(5,78,2,3,0));
		System.out.println("New Array of the elements : " + Arrays.toString(pro(5,7,2,3,0)));

		System.out.print("Array : ");
		double[] nums = pro(5,7,2,3,0);
		for(int i = 0; i < nums.length; i++)
		{
			System.out.print((int)nums[i] + " ");
		}
		
	}

}
