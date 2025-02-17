package exceptionhandling;

public class ThrowsKeyword {
/*
 	* throws keyword informs the caller of the method that it needs to handle these exceptions.
 	* throws keyword is used in method signatures to indicate that a matheod may throw one or more exceptions.
 */

	
	// Declaring that this method might throw Exceptions
	
	public static void test() throws NullPointerException, Exception
	{
		throw new NullPointerException();
	}
	
	
	public static void main(String[] args) {
        try {
            test(); // Calling method that throws Exception
        } catch (Exception e) {
            System.out.println("Exception handled: " + e);
        }
    }
}
