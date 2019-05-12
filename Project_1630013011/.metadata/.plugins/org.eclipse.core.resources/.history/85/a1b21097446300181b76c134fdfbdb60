
public class ControllerWithdraw extends Controller {
	public ControllerWithdraw(Bank m) {
		super(m);
	}
	
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