package generics;
// Connected to InterfaceClass and Main2

// Find the min and max value from an array.

public interface GenericInterface <T extends Comparable<T>> {

	// get the minimum value from array
	T getMin();
	
	// get the maximum value from array
	T getMax();
}
