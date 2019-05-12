public class GUI {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				Bank b = new Bank("Kelvin");
				try {
					b.addAccount(new StudentAccount("Kelvin",1000));
				} catch (NotEnoughMoneyException e) {
					System.out.println(e.getMessage());
				}
				ViewSimple v = new ViewSimple(b, new ControllerSimple(b));
				b.addListener(v);
			}
			
		});
	}
}