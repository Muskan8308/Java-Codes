package exceptionhandling;

public class tryCatch {

	public static void main(String[] args) {

		try
		{
			int a = 9;
			int b = 0;
//			int c = a/b;
			String s = "Hii";
			System.out.println(s.charAt(3));
		}
		catch(ArithmeticException e)	// e is an variable of ArithmeticException type which holds the reference of object of exception.
		{
			System.out.println("There is an ArithmeticException error");
			String mess = e.getMessage();	// This method gives the type of error.
			System.out.println(mess);
		}
		
		// We can handle multiple exceptions in single catch block.
		// We just have to keep in mind that all exceptions should be distinct.
		catch(NullPointerException | NumberFormatException | IndexOutOfBoundsException e)
		{
			System.out.println("There is an error");
			String mess = e.getMessage();	// This method gives the type of error.
			System.out.println(mess);
		}
		
		System.out.println("Program completed");
	}

}
