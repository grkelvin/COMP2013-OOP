public class CreditAccount extends Account {
	
	//A constructor which initializes name and money
	public CreditAccount(String name, int money) {
		super(name, money);
	}
	
	//Override the withdraw method
	@Override
	public void withdraw(int amount) {
		setMoney(getMoney() - amount);
	}
	
	//A static method for testing the CreditAccount class
	public static void testCreditAccount() {
		CreditAccount c = new CreditAccount("Aloy", 100);
		System.out.println(c.getMoney() == 100);
		System.out.println(c.getName().equals("Aloy"));
		c.withdraw(200);
		System.out.println(c.getMoney() == -100);
		c.setMoney(20);
		System.out.println(c.getMoney() == 20);
	}
}