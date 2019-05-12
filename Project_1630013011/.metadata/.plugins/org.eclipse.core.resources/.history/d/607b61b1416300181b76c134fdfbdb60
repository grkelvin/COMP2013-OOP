//A controller for withdraw
public class ControllerWithdraw extends Controller {
	public ControllerWithdraw(Bank m) {
		super(m);
	}
	
	//Withdraw money from the bank
	public String withdraw(String name, String amount) {
		try {
			int a = Integer.parseInt(amount);
			m.withdraw(name, a);
		} catch (NumberFormatException e) {
			return e.getMessage();
		} catch (UnknownCustomerException e) {
			return e.getMessage();
		}
		return "";
	}
}