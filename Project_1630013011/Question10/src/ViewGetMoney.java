import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ViewGetMoney extends View {
	private ControllerGetMoney c;
	private JTextField t;

	public ViewGetMoney(Bank m, ControllerGetMoney c) {
		super(m);
		this.c = c;
		this.setLayout(new GridLayout(1, 2));
		t = new JTextField();
		this.add(t);
		JButton b = new JButton("Search");
		this.add(b);
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(b, c.getMoney(t.getText()));
			}

		});
		this.setSize(400, 300);
		this.setVisible(true);
	}

	@Override
	public void update() {

	}
}