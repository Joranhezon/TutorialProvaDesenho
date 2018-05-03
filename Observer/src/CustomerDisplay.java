
public class CustomerDisplay implements Observer {
	
	@Override
	public void update(String str) {
		System.out.print("[CustormerDisplay] " + str);
	}
	
}
