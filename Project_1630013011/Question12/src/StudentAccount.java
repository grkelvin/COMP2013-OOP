public class StudentAccount extends Account {
	/*
	 * A constructor which initializes the account's name and money
	 * If the money is less than 0, throws a NotEnoutMoneyException
	 */
	public StudentAccount(String name, int money) throws NotEnoughMoneyException {
		super(name, money);
		if(money < 0) {
			throw new NotEnoughMoneyException("Cannot create student account with negative amount of money");
		}
	}
	
	/*
	 * Override the withdraw method
	 * If the amount is greater than the money, throws a NotEnoughMoneyException
	 */
	@Override
	public void withdraw(int amount) throws NotEnoughMoneyException {
		if(getMoney() < amount) {
			throw new NotEnoughMoneyException("Cannot withdraw " + amount + " yuan from account, only " + getMoney() + " is available");
		}
		setMoney(getMoney() - amount);
	}
	
	//A static method for testing the StudentAccount class
	public static void testStudentAccount() {
		try {
			StudentAccount s = new StudentAccount("Aloy", -1);
		} catch (NotEnoughMoneyException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			StudentAccount s1 = new StudentAccount("Aloy", 100);
			System.out.println(s1.getName().equals("Aloy"));
			System.out.println(s1.getMoney() == 100);
			s1.withdraw(20);
			System.out.println(s1.getMoney() == 80);
			s1.withdraw(120);
		} catch (NotEnoughMoneyException e) {
			System.out.println(e.getMessage());
		}
	}
}