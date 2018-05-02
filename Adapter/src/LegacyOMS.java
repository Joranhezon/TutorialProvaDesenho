import java.awt.List;
import java.util.ArrayList;

public class LegacyOMS {
	
	/* The legacy OMS accepts input in XML format */
	
	List cart = new ArrayList();
	List payments = new ArrayList();
	
	public void addItem(Item itemXml) {
		cart.add(itemXml);
		System.out.println(itemXml.getName() + " " + itemXml.getPrice());
	}
	
	public void makePayment(Payment paymentXml) {
		payments.add(paymentXml);
		paymentXml.pay();
	}
}
