package generics;

// here we are bounding our parameter to number type since we can't find average of strings or boolean values, we can only find average of number values whether they are int, double or float.
// So here we will bound our T by number class of java using using extends keyword
// Here T is child of Number (parent) class.

public class ParametersBounds <T extends Number>{

	private T[] nums;
	
	public ParametersBounds(T[] nums)
	{
		this.nums = nums;
	}
	
	// function to find average of given number values (like int, double, float)
	public double average()
	{
		double sum = 0;
		for(int i = 0; i < nums.length; i++)
		{
			sum = sum + nums[i].doubleValue();		// this will return the double value
		}
		return sum / nums.length;
	}
}
