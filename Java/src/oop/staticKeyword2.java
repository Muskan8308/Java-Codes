package oop;

public class staticKeyword2 {
	
	static double pi ;
	
	// static block : we can initialize static variables here and in the whole program always static block runs first even before the main method.

	
	static 
	{
		pi = 3.14;
		System.out.println("Static block runs first");
	}
	

	public static void main(String[] args) {

		System.out.println("Main method runs after the Static block");
	}

}
