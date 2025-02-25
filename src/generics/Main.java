package generics;

public class Main {

	public static void main(String[] args) {

		// We can't make object of generic class same as other classes's objects like
		// ❌ BasicGenerics g = new BasicGenerics("");		
		
		// Right way to make object of generic classes -
		
		BasicGenerics<Integer> g1 = new BasicGenerics<>(10);			// Here, object of integer type of same generic class
		System.out.println(g1.getT());
		
		BasicGenerics<String> g2 = new BasicGenerics<>("Hello");			// Here, object of string type of same generic class
		System.out.println(g2.getT());
		
		BasicGenerics<Boolean> g3 = new BasicGenerics<>(true);			// Here, object of boolean type of same generic class
		System.out.println(g3.getT());
		
		// Hence, a generic class's logic is used as per requirement and can be used with any datatype.
		
		MultipleParaGenerics<Integer, String> m = new MultipleParaGenerics<>(200, "String value");
		System.out.println(m.getT());
		System.out.println(m.getV());
	}

}
