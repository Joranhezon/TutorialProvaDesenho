
public class OMSAdapter {
	
	/* Object Adapter uses composition */
	private NewOMS newOMS;
	
	public OMSAdapter() {
		newOMS = new NewOMS();
	}
	
	public void addItem(Item item) {
		convertXmlToJson(item);
		newOMS.addToBasket(item);
	}
	
	public void makePayment(Payment p) {
		convertXmlToJson(p);
		newOMS.pay(p);
	}
	
	/* The new OMS accepts only Json input.
	 * Convert the client requests from XML to Json*/
	private void convertXmlToJson(Object o) {
		System.out.println("Convert from Xml to Json");
	}
}
