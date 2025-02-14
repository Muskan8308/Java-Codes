
// If we don't want to implement all the methods of interface so we can make our class abstract so that this class's child class will implement all the methods.

// One class has implemented two interfaces.

public class SwiggySender implements FoodDelivery, SpecialFoodDelivery {

	@Override
	public void sendFood(String pincode) {

		System.out.println("We'll soonly send your food order.");
	}

	@Override
	public double orderFees(String pincode) {
		return 50;
	}

	@Override
	public void specialFoodRecipe(String dish) {

		System.out.println("Your special dish is ready.");

	}

	
}
