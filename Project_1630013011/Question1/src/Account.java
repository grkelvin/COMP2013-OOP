public abstract class Account implements IAccount {
	private String name;
	private int money;
	
	//initializes name and money
	public Account(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public int getMoney() {
		return money;
	}
	
	protected void setMoney(int money) {
		this.money = money;
	}
	
	@Override
	public abstract void withdraw(int amount);
	
	
	public static void testAccount() {
		//Because this class is abstract, we cannot test it.
	}
}