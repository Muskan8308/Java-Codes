package generics;
										// GENERIC INHERITANCE

/*
 		* In this, there is no restriction to classes that all parent and child classes should be generic.
 		* If anyone of them is generic, then generic inheritance can be performed. 
 		* We can also override the methods, when we call that method by parent class's object then the method of parent class will called and similar for child class too.
 		* We can perform all this with interfaces also.
 */


public class GenericInheritance {

	public static void main(String[] args)
	{
		ParentInheritance<Integer> p1 = new ParentInheritance<>(456);
		ChildInheritance<Integer, String> c1 = new ChildInheritance<>(44556, " Rollno");

		System.out.println(p1.getT() + c1.getV("ROll No "));
		
		NonGeneric n1 = new NonGeneric();
		Generic1<String> g1 = new Generic1<>();
		
		System.out.println(n1.test());
		System.out.println(g1.test());

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

// When a generic class extends the non-generic class

// non-generic parent class
class NonGeneric {
	// We can override the methods same as inheritance.
	
	String test()
	{
		return ("Inside Parent class");
	}
}

// generic child class
class Generic1 <Y> extends NonGeneric {		// No need to pass a parameter to the parent class as it is non-generic.
	
	String test()
	{
		return ("Inside Child class");
	}
}

//When a non-generic class extends the generic class

// generic parent class
class GenericClass<T> {
	
	private T t;
	GenericClass(T t)
	{
		this.t = t;
	}
	
}

// non-generic parent class
class NonGeneric2 extends GenericClass<String> {		// we need to pass a parameter to the parent class as it is a generic class.
	
	NonGeneric2(String s)
	{
		super(s);
	}
}


