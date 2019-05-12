import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ViewWithdraw extends View {
	private ControllerWithdraw c;
	private JTextField t1;
	private JTextField t2;

	// withdraw
	public ViewWithdraw(Bank m, ControllerWithdraw c) {
		super(m);
		this.c = c;
		t1 = new JTextField();
		t2 = new JTextField();
		this.setLayout(new GridLayout(1, 3));
		JButton b = new JButton("Withdraw");
		this.add(t1);
		this.add(t2);
		this.add(b);
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String result = c.withdraw(t1.getText(), t2.getText());
				if (!result.equals("")) {
					JOptionPane.showMessageDialog(b, result);
				}
			}

		});
		this.setSize(400, 300);
		this.setVisible(true);
	}

	@Override
	public void update() {

	}

}