
public class CardPayment implements PaymentStrategy {
	
	private String cardType;
	private String issuer;
	private double amount;
	
	public CardPayment(){
		// Implements the class constructor
	}
	
	@Override
	public void pay() {
		// Pays with a credit card
	}
}
