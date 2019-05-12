//A controller for getting money
public class ControllerGetMoney extends Controller {
	public ControllerGetMoney(Bank m) {
		super(m);
	}
	
	//Get the money for the account specified by name
	public String getMoney(String name) {
		try {
			return Integer.toString(m.getMoney(name));
		} catch (UnknownCustomerException e) {
			return e.getMessage();
		}
	}
}