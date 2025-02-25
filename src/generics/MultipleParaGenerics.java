package generics;
// connected to main class

// We can make multiple type parameters in a generic class
public class MultipleParaGenerics <T, V> {

	private T t;
	private V v;
	
	MultipleParaGenerics(T t, V v)
	{
		this.t = t;
		this.v = v;
	}
	
	public T getT()
	{
		return t;
	}
	
	public V getV()
	{
		return v;
	}
}
