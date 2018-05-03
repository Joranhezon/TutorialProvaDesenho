
public class ClassPayment implements PaymentStrategy {
	
	private double amount;
	
	private ClassPayment(double amount) {
		this.amount = amount;
	}
	
	@Override
	public void pay() {
		// Pays with CLASS because cash is overrated
	}
}
