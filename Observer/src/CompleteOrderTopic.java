import java.util.ArrayList;
import java.util.List;

public class CompleteOrderTopic {
	
	List orderCompletedObservers = new ArrayList();
	
	public void notifyObservers(String line) {
		for(Observer o : orderCompletedObservers) {
			o.update(line);
		}
	}
	
	public void register(Observer o) {
		orderCompletedObservers.add(o);
	}
}
