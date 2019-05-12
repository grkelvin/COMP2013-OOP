public class StudentAccount extends Account {
	/*A constructor */
	public StudentAccount(String name, int money) throws NotEnoughMoneyException {
		super(name, money);
		if(money < 0) {
			throw new NotEnoughMoneyException("Cannot create student account with negative amount of money");
		}
	}
	
	@Override
	public void withdraw(int amount) throws NotEnoughMoneyException {
		if(getMoney() < amount) {
			throw new NotEnoughMoneyException("Cannot withdraw " + amount + " yuan from account, only " + getMoney() + " is available");
		}
		this.setMoney(getMoney() - amount);
	}
	
	//testing
	public static void testStudentAccount() {
		try {
			StudentAccount s = new StudentAccount("Kelvin", -1);
		} catch (NotEnoughMoneyException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			StudentAccount s1 = new StudentAccount("Kelvin", 100);
			System.out.println(s1.getName().equals("Kelvin"));
			System.out.println(s1.getMoney() == 100);
			s1.withdraw(20);
			System.out.println(s1.getMoney() == 80);
			s1.withdraw(120);
		} catch (NotEnoughMoneyException e) {
			System.out.println(e.getMessage());
		}
	}
}