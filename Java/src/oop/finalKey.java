package oop;

// By Using final keyword we cannot reassign the new value to the variables & instance variables.

public class finalKey {

	final int len;
	final int bdth;
	
	finalKey(int l, int b)		// final instance variables are initialized in the constructor
	{
		this.len = l;
		this.bdth = b;
	}
	
	int area()
	{
		return len*bdth;
	}
	
	public static void main(String[] args) {

		finalKey f1 = new finalKey(5,7);
		// f1.len = 5;
		System.out.println("Area is "+ f1.area());
	}

}
