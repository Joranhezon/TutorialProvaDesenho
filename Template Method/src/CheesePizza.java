
public class CheesePizza extends Pizza {
	
	@Override
	protected void addIngredients() {
		System.out.println("Added Cheese Pizza Ingredients");
	}
	
	@Override
	protected void addToppings() {
		System.out.println("Added Cheese Pizza Toppings");
	}
	
	@Override
	protected void cook() {
		System.out.println("Cooked for 10 minutes.");
	}
}
