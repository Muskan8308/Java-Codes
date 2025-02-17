package oop;

// B

public class Car extends Vehicle {
	
	Car(int dis, int time)
	{
		super(dis,time);
	}
	
	public int test()
	{
		int speed = getD() / getT();
		return speed;
	}

}
