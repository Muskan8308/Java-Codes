// OBJECT OF NESTED CLASSES

package oop;

public class ObjectOfNestedClass {

	public static void main(String[] args) {

	//	Object creation for non-static nested class
		
		OuterClass o1 = new OuterClass();					// object of outer class
		OuterClass.NestedClass n1 = o1.new NestedClass();	// object of inner class
		
		n1.a = 34;
        System.out.println(n1.a);
        
		OuterClass o2 = new OuterClass();					// object of outer class
		OuterClass.NestedClass n2 = o2.new NestedClass();	// object of inner class
		
		n2.a = 60;
        System.out.println(n2.a);
        
//    	Object creation for static nested class
      
        OuterClass.Inner i1 = new OuterClass.Inner();	// object of outer class, no need to create object for inner class
        i1.b = 10;
        System.out.println(i1.b);
        
        i1.test1();
	}

}


