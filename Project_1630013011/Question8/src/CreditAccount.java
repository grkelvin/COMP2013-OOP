public class CreditAccount extends Account {
	
	//A constructor
	public CreditAccount(String name, int money) {
		super(name, money);
	}
	
	@Override
	public void withdraw(int amount) {
		setMoney(getMoney() - amount);
	}
	
	//testing
	public static void testCreditAccount() {
		CreditAccount c = new CreditAccount("Kelvin", 100);
		System.out.println(c.getMoney() == 100);
		System.out.println(c.getName().equals("Kelvin"));
		c.withdraw(200);
		System.out.println(c.getMoney() == -100);
		c.setMoney(20);
		System.out.println(c.getMoney() == 20);
	}
}