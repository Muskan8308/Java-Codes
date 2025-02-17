package exceptionhandling;

public class ThrowKeyword {

	public static void main(String[] args) {

		try
		{
			Exception ex = new Exception("Dumy exception");
			throw ex;
		}
		catch(Exception e)
		{
			System.out.println("Exception message : " + e.getMessage());
		}
		System.out.println("Program Complete");
	}
	
	// purpose of throw keyword
	
	public String login(String name, String password)
	{
		if(password == null)
		{
			throw new IllegalArgumentException("Password is empty");
		}
		return "Loged In";
	}

}
