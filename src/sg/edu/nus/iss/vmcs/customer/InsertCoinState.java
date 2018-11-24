package sg.edu.nus.iss.vmcs.customer;

public class InsertCoinState implements State {

	TransactionController transactionCtrl;

	public InsertCoinState(TransactionController transactionCtrl)
	{
		this.transactionCtrl = transactionCtrl;
	}
	
	public void selectDrink(int identifier)
	{
		System.out.println("WARNING: You have already selected a drink.");
	}
	
	public void insertCoin()
	{
		this.transactionCtrl.completeTransaction();
		System.out.println("Thank you, enjoy your drink.");
		this.transactionCtrl.setState(this.transactionCtrl.getSelectDrinkState());
	}
	
	public void clearFault()
	{
		System.out.println("WARNING: Vending machine is not faulty currently.");
	}
}
