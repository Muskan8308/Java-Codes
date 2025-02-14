package exceptionhandling;

public class NestedTry {

	public static void main(String[] args) {

		try								// Flow of the code for error
		{								// Enters in the try block (1)
			try {						// Enters in the nested try (2)
				int a = 9;
				int b = 0;
				int c = a/b;			// Got an error (3)
			}
			finally						// Got finally block (4) but it will search for the catch block
			{
				
			}
		}								// Came out of the try block (5)
		catch(Exception e)				// Find its nearest catch block and handle the exception (6)
		{
			System.out.println("Program have some error :( ");
		}
	}

}
