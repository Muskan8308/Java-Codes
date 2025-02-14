package oop;
// Dynamic Poly-morphism / Dynamic Dispatch : Single interface, multiple actions.

class Parent1 {
	void test()
	{
		System.out.println("Parent Class");
	}
}

class Child1 extends Parent1 {
	void test()
	{
		System.out.println("Child1 Class");
	}
}

class Child2 extends Parent1 {
	void test()
	{
		System.out.println("Child2 Class");
	}
}

public class Polymorphism {

	public static void main(String[] args) {

		Child1 c1 = new Child1();
		Child2 c2 = new Child2();

// Here, assigning child's object's reference to the parent's reference variable which means both reference variable points to the same heap memory(object).
		
		Parent1 p1 = c1;		// Widening Conversion from parent to child (like from double to int)
		Parent1 p2 = c2;
		
		p1.test();
		p2.test();
	}

}
