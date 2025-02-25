package generics;
// Connected to Main class.

/*
 	* A generic class is identified by <T> here T is a datatype.
 	* if T is an integer then logic is applied to integers
 	* if T is an string then logic is applied to string and so on.
 */

public class BasicGenerics <T> {

	// We can use this T in this class anywhere like declare variables, in methods and in constructors and so on.
	
	private T t;	// A variable of type T
	
	public BasicGenerics(T t)		// constructors
	{
		this.t = t;
	}
	
	public T getT()			// method of type T
	{
		return this.t;
	}
	
	
}
