package oop;

/*
 * In this example EgCourierSender & EgCourierFedEx, we have used inheritance, method overriding, 	dynamic poly-morphism and abstract keyword mechanism.
 */

public abstract class EgCourierSender {

	// sends a courier to desired pincode
	public abstract void sendCourier(String pincode);
	
	// calculate fees to send courier to desired pincode
	public abstract double caculateFees(String pincode);
		
	// sending a courier to desired pincode is feasible or not
	public abstract boolean isFeasible(String pincode);
		
}
