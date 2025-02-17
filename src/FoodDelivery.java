
public interface FoodDelivery {
	// Inside an Interface, all the variables and methods present are static.

	// declare variables, they are static 
	String swiggyDelivery = "Swiggy";
	
	final String zomatoDelivery = "Zomato";

	// send food to this pin-code
	void sendFood(String pincode);	// normal method not static
	
	double orderFees(String pincode);
	
	// Default method
	default boolean isFeasible(String pincode)
	{
		return true;
	}
	
	// static method
	static FoodDelivery getfoodSender(String type)
	{
		if(type.equalsIgnoreCase(swiggyDelivery))
			return new SwiggySender();
		else if(type.equalsIgnoreCase(zomatoDelivery))
			return new ZomatoSender();
		throw new IllegalArgumentException("Invalid delivery type");
	}
}
