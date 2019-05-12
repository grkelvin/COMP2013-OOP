
public class ControllerGetMoney extends Controller {
	public ControllerGetMoney(Bank m) {
		super(m);
	}
	
	//Get the money
	public String getMoney(String name) {
		try {
			return Integer.toString(m.getMoney(name));
		} catch (UnknownCustomerException e) {
			return e.getMessage();
		}
	}
}