package exceptionhandling;

public class AuthenticationException extends Exception{

	public AuthenticationException(String message) {		// constructor 

		super(message);
	}

}


//public class AuthenticationException extends RuntimeException{
//
//	public AuthenticationException(String message) {		// constructor 
//
//		super(message);
//	}
//
//}
