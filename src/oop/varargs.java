// An Advance concept - Variable length arguments (varargs) in methods
package oop;
import java.util.Arrays;

public class varargs {
	
	// In this concept, we can give n numbers of arguments and the method returns the answer on the basis of the parameters.
	
	static int add(int... args)		// here args is an variable of integer array type
	{
		int sum = 0;
		for(int i = 0; i < args.length; i++)
		{
			sum += args[i];
		}
		return sum;
	}
	
	static String print(String... string)
	{
		System.out.println(Arrays.toString(string));
		return " Hii " + String.join(", ", string);
	}

	public static void main(String[] args) {
		
		System.out.println(add(5,7));
		System.out.println(add(5,4,6,7));
		System.out.println(add(5,7,9,2,0,3));
		
		int[] arr = new int[] {4,7,8,3,5};
		System.out.println(add(arr));

		System.out.println(print("Muskan"));
		System.out.println(print("John","Ria","Madhav"));
		System.out.println(print("Man! How are you"));

	}

}
