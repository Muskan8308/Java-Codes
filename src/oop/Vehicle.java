package oop;

// B

public abstract class Vehicle {
	
	private int dis , time; 
	
	Vehicle(int dis, int time)
	{
		this.dis = dis;
		this.time = time;
	}
	
	public abstract int test();

	/*
	public int test()
	{
		int speed = time * dis;
		return speed;
	}
	*/
	
	public int getD()
	{
		return dis;
	}
	
	public int getT()
	{
		return time;
	}
}
