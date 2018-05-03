
public class DeepFried extends PizzaDecorator {
	
	public DeepFried(Item inner) {
		super(inner);
	}
	
	@Override
	public void prepare() {
		super.prepare();
		System.out.println(" + DeepFried");
	}
}
