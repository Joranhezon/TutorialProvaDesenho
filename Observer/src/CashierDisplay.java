
public class CashierDisplay implements Observer {
	
	@Override
	public void update(String str) {
		System.out.print("[CashierDisplay" + str);
	}
	
}
