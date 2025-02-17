// NESTED CLASSES

// In a file, only one public class can exists apart from that there can be many private classes exists.

package oop;

//  Inside a public class, can be public or private nested classes exist.	

public class OuterClass {
	
	public static int a = 9;
	
	public static void test()
	{
        System.out.println(a);
        a = 12;
	}
	
	// Non - Static nested class
	public class NestedClass 	
	{
		public int a = 10;
	}
	
	// Static nested class
	public static class Inner	// If this is a static class then its instance variables and data members will also be static 
	{
		public int b = 20;
		
		public static void test1()
		{
	        System.out.println(a);
	        test();
		}
		
	}
}
