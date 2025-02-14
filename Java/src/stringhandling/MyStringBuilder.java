package stringhandling;

public class MyStringBuilder {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		sb.append("Hello");
		sb.append("Girl");
		sb.append(true);
		sb.append(13);
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		char ch = sb.charAt(4);
		System.out.println(ch);
		System.out.println(sb.deleteCharAt(7));
		
		System.out.println(sb.reverse());
		System.out.println(sb.substring(2,7));
		
		String s = sb.toString();
		System.out.println("String is -> "+ s);
		
	}

}
