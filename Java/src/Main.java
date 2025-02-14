// Food Delivery

public class Main {

	public static void main(String[] args) {

		FoodDelivery fd = FoodDelivery.getfoodSender(FoodDelivery.swiggyDelivery);		// dynamic dispatch
		fd.sendFood("357782");
	
		SpecialFoodDelivery sf = SpecialFoodDelivery.getfoodSender(SpecialFoodDelivery.dishName);
	
		sf.specialFoodRecipe("French Fries");
	}

}
