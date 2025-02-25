package generics;

// Connected to InterfaceClass and GenericInterface

public class Main2 {

	public static void main(String[] args) {

		Generic<Integer> g1 = new Generic<>(50);
		Generic2<Boolean> g2 = new Generic2<>(true);
		
		InterfaceClass<Integer> i = new InterfaceClass<>(new Integer[] {5,7,8,2,1});
		System.out.println("Maximum : " + i.getMax());
		System.out.println("Minimum : " + i.getMin());

	}

}
