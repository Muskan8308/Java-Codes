package oop;

public class ConstructorOverloading {
	
	ConstructorOverloading(int a)
	{
		System.out.println(a);
	}
	
	ConstructorOverloading(int a, double b)
	{
		System.out.println(a * b);
	}
	
	ConstructorOverloading(int a, int b)
	{
		System.out.println((a * b) / 2);
	}
	
	ConstructorOverloading(char c, String a)
	{
		System.out.println(c + a);
	}

	public static void main(String[] args) {

		ConstructorOverloading c1 = new ConstructorOverloading(56);
		ConstructorOverloading c2 = new ConstructorOverloading(56, 89.45);
		ConstructorOverloading c3 = new ConstructorOverloading('@', "MuskanChourasia");
		ConstructorOverloading c4 = new ConstructorOverloading(56, 678);
		ConstructorOverloading c5 = new ConstructorOverloading('z');	// this calls const1 and prints the ASCII value of the character.
		ConstructorOverloading c6 = new ConstructorOverloading('#',"girlsPower");


	}

}
