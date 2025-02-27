package generics;

class NonGeneric3 {
	
	public static <T extends Number> void sum(T[] t)
	{
		int evenSum = 0, oddSum = 0;
		for(int i = 0; i < t.length; i++)
		{
			if(t[i].intValue() % 2 == 0)
			{
				evenSum += t[i].intValue();
			}
			else
			{
				oddSum += t[i].intValue();
			}
		}
		System.out.println("Sum of Even values : " + evenSum);
		System.out.println("Sum of Odd values : " + oddSum);

	}
}

public class Questions {

	public static void main (String[] args) {
		
		NonGeneric3 n = new NonGeneric3();
		n.sum(new Integer[] {5,67,8,2,34,5});
		
	}
}
