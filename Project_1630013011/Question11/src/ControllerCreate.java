
public class ControllerCreate extends Controller {
	public ControllerCreate(Bank m) {
		super(m);
	}
	
	public String create(String name, String amount, int type) {
		try {
			if(type == 0) {
				m.addAccount(new CreditAccount(name, Integer.parseInt(amount)));
			} else {
				m.addAccount(new StudentAccount(name, Integer.parseInt(amount)));
			}
			return "";
		} catch (NumberFormatException e) {
			return e.getMessage();
		} catch (NotEnoughMoneyException e) {
			return e.getMessage();
		}
	}
	
}