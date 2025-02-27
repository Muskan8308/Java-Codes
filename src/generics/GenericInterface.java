package generics;
// Connected to InterfaceClass and Main2

/*
		* Yeh ek generic interface hai, jo T naam ka generic type accept karta hai.
		* T extends Comparable<T> ka matlab hai ki T sirf wahi classes ho sakti hain jo Comparable<T> interface ko implement karti hain.
		* Comparable<T> ek built-in Java interface hai jo objects ko compare karne ke liye use hota hai (compareTo() method ke through).
		* Iska main purpose yeh ensure karna hai ki jo bhi type T hoga, uske objects ko compare kiya ja sake.
		* Example: Agar T ko String ya Integer jaisa type diya jaye, toh valid hoga kyunki String aur Integer dono Comparable<T> ko implement karte hain. 
 */

// Find the min and max value from an array.

public interface GenericInterface <T extends Comparable<T>> {

	// get the minimum value from array
	T getMin();
	
	// get the maximum value from array
	T getMax();
}
