public abstract class Account implements IAccount {
	private String name;
	private int money;
	
	//A constructor which initializes name and money
	public Account(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	//A getter for name
	@Override
	public String getName() {
		return name;
	}
	
	//A getter for money
	@Override
	public int getMoney() {
		return money;
	}
	
	//Set the money
	protected void setMoney(int money) {
		this.money = money;
	}
	
	//Withdraw money
	@Override
	public abstract void withdraw(int amount) throws NotEnoughMoneyException;
	
	//A static method for testing the Account class
	public static void testAccount() {
		
	}
}