package sg.edu.nus.iss.vmcs.customer;

public class SelectDrinkState implements State {
	
	TransactionController transactionCtrl;

	public SelectDrinkState(TransactionController transactionCtrl)
	{
		this.transactionCtrl = transactionCtrl;
	}
	
	public void selectDrink(int identifier)
	{
		this.transactionCtrl.startTransaction(identifier);
		System.out.println("A drink is selected, you can insert coin now.");
		this.transactionCtrl.setState(this.transactionCtrl.getInsertCoinState());
	}
	
	public void insertCoin()
	{
		System.out.println("WARNING: Please select a drink first.");
	}
	
	public void clearFault()
	{
		System.out.println("WARNING: Vending machine is not faulty currently.");
	}
}
