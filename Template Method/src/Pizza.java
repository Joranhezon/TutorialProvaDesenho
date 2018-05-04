
public abstract class Pizza {
	
	// Template Method
	public final void preparePizza() {
		selectCrust();
		addIngredients();
		addToppings();
		cook();
	}
	
	// Define abstract steps to be overwritten
	protected abstract void addToppings();
	protected abstract void addIngredients();
	
	/* Define default implementations */
	
	protected void selectCrust() {
		System.out.println("Selected default crust");
	}
	
	protected void cook() {
		System.out.println("Cooked for 5 minutes");
	}
}
