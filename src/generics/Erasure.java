package generics;
										// ERASURE / GENERIC AMBIGUITY
/*
 	*  Internally, the generic code will converted into white space code and the java will cast the data (not our concern)
	*  Due to this, we get the ambigious situation which is called as Erasure or Generic Ambiguity.
	*  To avoid this situation, we can simply use diff method names.
	*  BTW or parenthetically, this is an rare situation to get this type of complie error.
 */

										// GENERICS RESTRICTIONS
/*
  	1. We can't instantiate an object of type T.
  		like - T t = new T();	❌
  	
  	2. We can't instantiate an array of type T.
  		like - T[] t = new T[5];	❌
  
  	3. We can't instantiate an array of type Generic class.
  		like - Generic<String>[] t = new Generic<>[10];		❌
  		
  	4. We can't use type parameter T on static methods.
  		like - public static void test(T t);	❌
  		
  	5. We can't extend generic class from Throwable class.
  		like - class Generic<T> extends Throwable {}	❌
  		
 */


public class Erasure{
	
	public static void main(String[] args) {

		Ambigious<String, String> s = new Ambigious<>();
		s.setT(null);
		s.setV(null);
	}

}

class Ambigious <T, V> {
	private T t;
	private V v;
	
//	void set(T t)			This will cause ambiguity since internally this code will converted into objects like -> void set(Object t)
	void setT(T t)
	{

	}
	
//	void set(V v)			like -> void set(Object v)
	void setV(V v)
	{
		
	}

}
