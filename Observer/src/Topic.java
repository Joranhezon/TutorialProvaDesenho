
public interface Topic {
	
	public void register(Observer obj);
	public void notifyObservers(String line);
	
}
