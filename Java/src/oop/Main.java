package oop;

// A

public class Main {

	public static void main(String[] args) {

//		Rectangle r = new Rectangle(10, 20);
//		double area = r.area();
//		System.out.println("Area of Rectangle : " + area);
		
		ColorRectangle c = new ColorRectangle(10, 20, "Yellow");
		double area1 = c.area();
		System.out.println("Area of Rectangle : " + area1);
		
		Triangle t = new Triangle(10, 20);
		System.out.println("Area of Triangle : " + t.area());
		
	}

}
