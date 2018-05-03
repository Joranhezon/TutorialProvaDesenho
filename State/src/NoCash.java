
public class NoCash implements AtmState {
	
	Atm atm;
	
	NoCash(Atm atm) {
		this.atm = atm;
	}
	
	@Override
	public void withdraw(int amount) {
		// Code for withdrawing money
	}
	
	@Override
	public void refill(int amount) {
		// Code for refilling money
	}
}
