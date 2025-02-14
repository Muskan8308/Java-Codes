package stringhandling;

public class MethodsOfStrings {

	public static void main(String[] args) {

		String s = "Heloo god";
		
		int n = s.length();
		System.out.println(n);
		
		s = s + 34 + true + 65.899 + 'e';
		System.out.println(s);

		System.out.println(String.valueOf("Ruby"));		// valueOf() - gives the string representation of any value
		System.out.println(String.valueOf(false));
		System.out.println(String.valueOf(new Object()));

		char ch = s.charAt(4);
		System.out.println(ch);

		String s2 = "EMPTY";
		char arr[] = s2.toCharArray();
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		byte[] barr = s2.getBytes();
		System.out.println(barr);
		
		byte[] barr2 = s2.getBytes();
		System.out.println(barr2);

		// Comparison of Strings
		
		String s3 = "java";
		String s4 = new String("java");
		
		boolean e = s3.equals(s4);
		System.out.println(e);
		
		boolean e2 = s3.equalsIgnoreCase("JavA");
		System.out.println(e2);

		// To get index of any character
		
		String s5 = "LEVEL";
		int i = s5.indexOf('E');		// First occurence of character
		System.out.println(i);

		int i2 = s5.lastIndexOf('E');		// last occurence of character
		System.out.println(i2);
		
		// To Modify strings
		
		String ss = "Hello Everyone! Nice to meet you. Will meet soon.";
		
		String sub1 = ss.substring(6);
		System.out.println(sub1);

		String sub2 = ss.substring(6, 12);		// last index is exclusive
		System.out.println(sub2);
		
		String rep = ss.replace('o', 'u');
		System.out.println(rep);
		
		String rep1 = ss.replace("meet", "catch up");
		System.out.println(rep1);
		
		String rep2 = ss.replaceAll("ee", "cc");
		System.out.println(rep2);

		String rep3 = ss.replaceFirst("meet", "catch");
		System.out.println(rep3);
		
		// Triming the string
		
		String sss = "   asddf rfhj      ";
		String trm = sss.trim();
		System.out.println(trm);
		
		System.out.println(sss.toLowerCase());
		System.out.println(sss.toUpperCase());

		// Joining of String 
		
		// Join - We can join the strings by using any of the delimiter(like " ", ",", "-", "_", and so on).

		String j = String.join("-", "Muskan","Chourasia");
		System.out.println(j);
		
		String j2 = String.join(",", s2, s3, s5);
		System.out.println(j2);


	}

}
