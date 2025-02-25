package generics;
// Connected to Main2.java

											// WILDCARD ARGUMENTS
public class Generic<T> {
	
	private T t;
	
	public Generic(T t)
	{
		this.t = t;
				
	}
	
	private T getT()
	{
		return this.t;
	}
	
	// I want to make a method with the 2nd class's type of parameter
	
	private void test(Generic2<?> g1)	// WildCard Arguments - simple mtlb h ki kisi bhi type ke datatype ko match krlo 
	{
		
	}

	private void demo(Generic2<? extends Number> g1)	// Upper Bounded WildCard Arguments - arguments ko bound kr diya by their upper bound like Generic2 can hold all the child classes of Number.
	{
		
	}
	
	private void demo2(Generic2<? super Integer> g1)	// WildCard Arguments -  arguments ko bound kr diya by their lower bound like Generic2 can hold Integer, Number and Object.
	{
		
	}
}

class Generic2 <G> {
	
	private G g;
		
		public Generic2(G g)
		{
			this.g = g;
					
		}
		
		private G getG()
		{
			return this.g;
		}
}
