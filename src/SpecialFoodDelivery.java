// One interface can extend multiple interfaces, unlike class.
// one interface have extended another interface

public interface SpecialFoodDelivery extends FoodDelivery{

	String dishName = "Chinese";
	
	void specialFoodRecipe(String dish);
	
	static SpecialFoodDelivery getfoodSender(String type) {
		
		if(type.equalsIgnoreCase(dishName))
			return new SwiggySender();
		
		throw new IllegalArgumentException("Invalid delivery type");
	}
}
