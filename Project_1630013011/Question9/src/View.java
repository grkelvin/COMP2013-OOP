import javax.swing.JFrame;

public abstract class View extends JFrame implements ModelListener {
	protected Bank m;
	
	//initializes the Bank
	public View(Bank m) {
		this.m = m;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public abstract void update();	
}