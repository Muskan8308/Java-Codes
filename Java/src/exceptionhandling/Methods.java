package exceptionhandling;

public class Methods {

	public static void main(String[] args) {

		try
		{
			demo();					// we can put methods inside it
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error");
		}	
	}
	
	public static void demo()
	{
		int[] arr = {4,6,8,4,9};
		System.out.println(arr[5]);
	}
}
