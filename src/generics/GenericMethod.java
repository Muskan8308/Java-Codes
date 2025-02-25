package generics;

import java.util.Arrays;

//	GENERIC METHOD

/*
 		* Generic methods can be inside a generic class as well as non-generic class.
 		* Inside a generic class, there can be a generic method as well a non-generic method.  
 		* To call a generic method, we need to use reference type of datatype like Integer, Double, Boolean, etc. since generics can't work with primitive datatypes.   
 		* We can also use bounded and wildcard arguments here same as the generic class.
 */

public class GenericMethod {

	// main method - called by jvm
	public static void main(String[] args) {
		
		// To call a generic method -
		
		Integer[] arr1 = new Integer[] {4,7,2,0,1,4,6};		// Reference datatype
		Integer[] sortedArr = sort(arr1);
		for(int a : sortedArr)
		{
			System.out.print(a + " ");

		}
			
		System.out.println();
		Double[] arr2 = new Double[] {4.0,7.8,2.4,0.5,1.1,4.7,6.8};
		Double[] sortedArr2 = sort(arr2);
		for(double a : sortedArr2)
		{
			System.out.print(a + " ");

		}
		System.out.println();

		System.out.println(demo(true));
		System.out.println(demo("Hii I can pass inside it a string, int, double ,boolean and etc."));
		System.out.println(demo(578.90603));

			
		Integer[] arr = new Integer[] {1,2,3};
		boolean c1 = check(2,arr);
		System.out.println(c1);

		Character[] chh = new Character[] {'a','u','e','i','o'};
		boolean c2 = check('w',chh);
		System.out.println(c2);
	}
	
	// Generic method 
	
	private static <T extends Number> T[] sort(T[] arr)
	{
		Arrays.sort(arr);
		return arr;
	}

	public static <T> T demo(T t)	// we can also use bounded, wildcard parameters here also
	{
		return t;
	}
	
	// method to check if object is in array or not
	
	private static <T, V> boolean check(T t, V[] arr)	
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(t.equals(arr[i]))
				return true;
		}
		return false;
	}
	
	
	
}
