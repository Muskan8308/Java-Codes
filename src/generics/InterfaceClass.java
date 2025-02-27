package generics;

// Connected to GenericInterface and Main2

/*
 		* Yeh GenericInterface<T> ka implementation hai ek class ke through.
		* Iska matlab hai ki "InterfaceClass" ek generic class hai jo T type ko accept karegi, lekin wahi types jo Comparable<T> ko follow karte hain.
		* "implements GenericInterface<T>" ka matlab hai ki yeh class GenericInterface<T> ko implement kar rahi hai aur uske rules follow karegi. 
 */

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
