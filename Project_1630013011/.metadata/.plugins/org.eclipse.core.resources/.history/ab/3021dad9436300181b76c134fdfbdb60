public class GUI {
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				Bank b = new Bank("Kelvin");
				ViewSimple v = new ViewSimple(b, new ControllerSimple(b));
				ViewGetMoney v1 = new ViewGetMoney(b, new ControllerGetMoney(b));
				ViewWithdraw v2 = new ViewWithdraw(b, new ControllerWithdraw(b));
				ViewCreate v3 = new ViewCreate(b, new ControllerCreate(b));
				b.addListener(v);
				b.addListener(v1);
				b.addListener(v2);
				b.addListener(v3);
			}
			
		});
	}
}