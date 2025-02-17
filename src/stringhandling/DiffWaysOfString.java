package stringhandling;

public class DiffWaysOfString {

	public static void main(String[] args) {

	// Different ways to declare a string. 	
		
		String s = new String();						// Empty string initialization
		System.out.println(s);
		
		String s2 = new String("MonaLisa");				// String initialization with a value
		System.out.println(s2);
		
		char arr[] = new char[] {'M','Y','T','H'};		// By making a character array and assign it to a string
		String s3 = new String(arr);
		System.out.println(s3);                                                                                                              

		char arr2[] = new char[] {'E','M','P','T','Y'};	// By making a character array and assign it to a string but upto some index where nth index is exclusive
		String s4 = new String(arr2, 0, 4);
		System.out.println(s4);
		
		byte[] arr3 = new byte[] {65,76,87,66,70};		// By making a byte array and assign it to a string
		String s5 = new String(arr3);
		System.out.println(s5);
	}

}
