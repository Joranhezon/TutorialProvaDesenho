import java.util.ArrayList;
import java.util.List;

public class AddItemTopic implements Topic {
	
	List addItemObservers = new ArrayList();
	
	@Override
	public void notifyObservers(String line) {
		for(Observer o : addItemObservers) {
			o.update(line);
		}
	}
	
	@Override
	public void register(Observer o) {
		addItemObservers.add(o);
	}
}
