package generics;
										// GENERIC INHERITANCE

/*
 		* In this, there is no restriction to classes that all parent and child classes should be generic.
 		* If anyone of them is generic, then generic inheritance can be performed. 
 */


public class GenericInheritance {

	public static void main(String[] args)
	{
		ParentInheritance<Integer> p1 = new ParentInheritance<>(456);
		ChildInheritance<Integer, String> c1 = new ChildInheritance<>(44556, "Rollno");

		System.out.println(p1.getT() + c1.getV("ROll No "));
	}
}

//generic parent class
class ParentInheritance <T> {

	private T t;
	ParentInheritance(T t)
	{
		this.t = t;
	}
	
	T getT()
	{
		return this.t;
	}
}



// generic child class
class ChildInheritance <T, V> extends ParentInheritance<T>{		// We can use multiple parameters

	private V v;
	
	ChildInheritance(T t, V v)
	{
		super(t);				// Although, we are not using T in this class, but to satisfying the parent class, we have to pass it to parent class by super keyword.
		this.v = v;
	}
	
	V getV(V v)
	{
		return this.v;
	}
	
}