package oop;

public class EgCourierFedEx extends EgCourierSender {

	public void sendCourier(String pincode)
	{
		
	}
	
	// calculate fees to send courier to desired pincode
	public double caculateFees(String pincode)
	{
		return 1;
	}

		
	// sending a courier to desired pincode is feasible or not
	public boolean isFeasible(String pincode)
	 {
		return true;
	 }

	
}
