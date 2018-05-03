
public class Atm implements AtmState {
	
	private int cashStock;
	private AtmState currentState;
	
	public Atm() {
		currentState = new NoCash(this);
	}
	
	//MOST IMPORTANT PART OF THE CODE
	private void setState(AtmState newState) {
		this.currentState = newState;
	}
	
	public int getCashStock() {
		return cashStock;
	}
	
	public void setCashStock(int cashStock) {
		this.cashStock = cashStock;
	}
	
	@Override
	public void withdraw(int amount) {
		currentState.withdraw(amount);
	}
	
	@Override
	public void refill(int amount) {
		currentState.refill(amount);
	}
}
