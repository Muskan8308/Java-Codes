package generics;

//Connected to GenericInterface and Main2

public class InterfaceClass<T extends Comparable<T>> implements GenericInterface<T>{
	
	private T[] nums;
	
	public InterfaceClass(T[] nums)
	{
		this.nums = nums;
	}
	
	// get the min value
	public T getMin()
	{
		T min = nums[0];
		for(int i = 0; i < nums.length; i++)
		{
			if(nums[i].compareTo(min) < 0)
				min = nums[i];
		}
		return min;
	}
	
	// get the max value
		public T getMax()
		{
			T max = nums[0];
			for(int i = 0; i < nums.length; i++)
			{
				if(nums[i].compareTo(max) > 0)
					max = nums[i];
			}
			return max;
		}
}
