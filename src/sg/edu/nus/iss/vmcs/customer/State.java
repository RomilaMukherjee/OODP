package sg.edu.nus.iss.vmcs.customer;

public interface State {
	
	public void selectDrink(int identifier);
	
	public void insertCoin();
	
	public void clearFault();
}
