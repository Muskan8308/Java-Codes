package exceptionhandling;

// AuthenticationException file

// We can create our own custom exception classes to throw an exception.


public class CustomExceptions {

	// We have to use throws keyword when we are dealing with checked (compile time) exceptions.
	
	public static String authenticate(String username, String password) throws AuthenticationException
	{
		throw new AuthenticationException("Invalid password");
	}
	
	// And when we are dealing with unchecked (runtime time) exceptions, there is no need of using throws keyword.
	
//	public static String authenticate2(String username, String password) 
//	{
//		throw new AuthenticationException("Invalid password");
//	}
//	
	public static void main(String[] args)
	{
//		authenticate2("Sonia", "456");
		try
		{
			authenticate("Sonia", "456");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
