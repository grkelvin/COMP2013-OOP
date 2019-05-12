import java.util.InputMismatchException;
import java.util.Scanner;

public class TUI {
	public static void main(String[] args) {
		Bank b = new Bank("Aloy");
		while(true) {
			int option = readPosInt("Type an action (total:1 add:2 list:3 withdraw:4 deposit:5 quit:6): ");
			
			switch(option) {
		        case 1:
		        	System.out.println("Total money in the bank: " + b.totalMoney());
		        	break;
		        case 2:
		        	int addOption = readPosInt("Type the account type (credit:1 student:2): ");
		        	if(addOption > 2) {
		        		System.out.println("Unknown type of account!");
		        		continue;
		        	}
		        	
		        	String name = readLine("Enter the name of the customer: ");
		        	int money = readPosInt("Enter the initial amount of money: ");
		        	switch(addOption) {
		        	    case 1:
		        	    	b.addAccount(new CreditAccount(name, money));
		        	    	break;
		        	    case 2:
		        	    	try {
		        	    		b.addAccount(new StudentAccount(name, money));
		        	    	} catch (NotEnoughMoneyException e) {
		        	    		System.out.println("BUG! This must never happen!" );
		        	    		System.exit(1);
		        	    	}
		        	}
		        	break;
		        case 3:
		        	String customerName = readLine("Enter the name of the customer: ");
		        	try {
		        		System.out.println(customerName + " has " + b.getMoney(customerName) + " yuan in the bank");
		        	} catch (UnknownCustomerException e) {
		        		System.out.println(e.getMessage());
		        	}
		        	break;
		        case 4:
		        	String withdrawCustomerName = readLine("Enter the name of the customer: ");
		        	int amount = readPosInt("Enter the amount of money to withdraw: ");
		        	try {
		        		b.withdraw(withdrawCustomerName, amount);
		        	} catch (UnknownCustomerException e) {
		        		System.out.println(e.getMessage());
		        	}
		        	break;
		        case 5:
		        	String depositorName = readLine("Enter the name of the customer: ");
		        	int depositAmount = readPosInt("Enter the amount of money to deposit: ");
		        	
		        	try {
		        		b.withdraw(depositorName, -depositAmount);
		        	} catch (UnknownCustomerException e) {
		        		System.out.println(e.getMessage());
		        	}
		        	break;
		        case 6:
		        	System.out.println("Goodbye!");
		        	System.exit(0);
		    	    break;
			    default:
			    	System.out.println("Unknown action!");
			}
		}
		
	}
	
	//Print out a message and read the user's input
	private static String readLine(String msg) {
		System.out.print(msg);
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}
	
	/*
	 * Print a message and read the positive integer input by the user
	 * Print a error message and let he/she input again if the user's input is invalid
	 */
	private static int readPosInt(String msg) {
		int n = 0;
		
		while(true) {
			System.out.print(msg);
			Scanner s = new Scanner(System.in);
			try {
				n = s.nextInt();
				s.nextLine();
				if(n <= 0) {
					System.out.println("Positive integers only!");
				} else {
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("You must type an integer!");
				s.nextLine();
			}
		}
		return n;
	}
}