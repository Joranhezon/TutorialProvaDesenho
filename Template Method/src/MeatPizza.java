
public class MeatPizza extends Pizza {
	
	@Override
	protected void addIngredients() {
		System.out.println("Added Meat Pizza Ingredients");
	}
	
	@Override
	protected void addToppings() {
		System.out.println("Added Meat Pizza Toppings");
	}
	
	@Override
	protected void cook() {
		System.out.println("Cooked for 15 minutes");
	}
}
