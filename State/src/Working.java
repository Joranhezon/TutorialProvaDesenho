
public class Working implements AtmState {
	
	Atm atm;
	
	Working(Atm atm) {
		this.atm = atm;
	}
	
	@Override
	public void withdraw (int amount) {
		// Code for withdrawing money
	}
	
	@Override
	public void refill(int amount) {
		// Code for withdrawing money
	}
}
