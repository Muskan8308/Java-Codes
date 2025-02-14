package exceptionhandling;

public class FinallyKeyword {
	
	/*
	 * 
	 * Finally block is used for cleanup activities like closing files, releasing resources or cleaning up connections to ensure that these tasks are performed even if an exception occurs.
	 * Finally block is optional but its present then it will always be executed after the try-catch blocks even if exception occurs, not occurs, no exception occurs or even return, break or continue statement is encountered within the try-catch.
	 
	 */
	
	
	static String demo()
	{
		try
		{
			return "Inside try";
		}
		finally
		{
			return "Inside Finally";			// This will override the return in try
		}
	}

	public static void main(String[] args) {

		try
		{
			int[] a = new int[5];
			a[9] = 7;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Catch Message : " + e.getMessage());
		}
		finally
		{
			System.out.println("Inside Finally block" );

		}
		
		System.out.println(demo());
		
		try
		{
			int a = 10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch Message : " + e.getMessage());
		}
		finally
		{
			System.out.println("Inside Finally block" );
			 int[] arr = new int[5];
	         arr[10] = 50; 							// ArrayIndexOutOfBoundsException         
 /*
  *  finally block mein throw hua exception (ArrayIndexOutOfBoundsException) call stack mein upar jaata hai, aur try-catch block mein throw hua ArithmeticException lost ho jaata hai. Isliye, program ka final output ArrayIndexOutOfBoundsException dikhata hai.

  *  which means finally block mein agar exception throw hota hai, toh woh try ya catch block mein throw hue exception ko override kar deta hai.

  */
		}
	}

}
