import javax.swing.JLabel;

public class ViewSimple extends View implements ModelListener {
	private ControllerSimple c;
	private JLabel label;
	
	//Add a label
	public ViewSimple(Bank m, ControllerSimple c) {
		super(m);
		this.c = c;
		label = new JLabel("There are "+Integer.toString(m.totalMoney())+" in the bank!");
		this.setSize(400, 300);
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void update() {
		label.setText("There are "+Integer.toString(m.totalMoney())+" in the bank!");
	}
}