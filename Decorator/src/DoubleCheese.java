
public class DoubleCheese extends PizzaDecorator {
	
	public DoubleCheese(Item inner) {
		super(inner);
	}
	
	@Override
	public void prepare() {
		super.prepare();
		System.out.print(" + Double Cheese");
	}
}
