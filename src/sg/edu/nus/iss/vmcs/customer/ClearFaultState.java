package sg.edu.nus.iss.vmcs.customer;

public class ClearFaultState implements State {

	TransactionController transactionCtrl;

	public ClearFaultState(TransactionController transactionCtrl)
	{
		this.transactionCtrl = transactionCtrl;
	}
	
	public void selectDrink(int identifier)
	{
		System.out.println("WARNING: Fault occured, you cannot select drinks.");
	}
	
	public void insertCoin(int total)
	{
		System.out.println("WARNING: Fault occured, you cannot insert coins.");
	}
	
	public void clearFault()
	{
		this.transactionCtrl.terminateTransaction();
		System.out.println("Fault in vending machine has been cleared.");
		this.transactionCtrl.setState(this.transactionCtrl.getSelectDrinkState());
	}
}
