package exceptionhandling;

/*
 * At the point we get any exception, our program will not execute further.
 * We can say, Exception will kill our program.
 */

public class Exceptions {

	public static void main(String[] args) {

		int a = 10;
		int b = 0;
		int c = a/b;			// Arithmetic exception
		System.out.println(c);
		System.out.println("After Exception");

	}
}
