import java.util.ArrayList;
import java.util.List;

public class AddPaymentTopic implements Topic {
	
	List addPaymentObservers = new ArrayList();
	
	@Override
	public void notifyObservers(String line) {
		for(Observer o : addPaymentObservers) {
			o.update(line);
		}
	}
	
	public void register(Observer o) {
		addPaymentObservers.add(o);
	}
}
