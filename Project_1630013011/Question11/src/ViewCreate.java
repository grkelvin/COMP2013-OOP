import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ViewCreate extends View {
	private ControllerCreate c;
	private JTextField t1;
	private JTextField t2;
	private JComboBox<String> cb;

	public ViewCreate(Bank m, ControllerCreate c) {
		super(m);
		t1 = new JTextField();
		t2 = new JTextField();
		this.c = c;
		this.setLayout(new GridLayout(4, 1));
		this.add(t1);
		this.add(t2);
		cb = new JComboBox<>();
		cb.addItem("Credit Account");
		cb.addItem("Student Account");
		this.add(cb);
		JButton b = new JButton("Add");
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String result = c.create(t1.getText(), t2.getText(), cb.getSelectedIndex());
				if (!result.equals("")) {
					JOptionPane.showMessageDialog(b, result);
				}
			}

		});
		this.add(b);

		this.setSize(400, 300);
		this.setVisible(true);
	}

	@Override
	public void update() {

	}
}