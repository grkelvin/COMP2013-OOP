import javax.swing.JFrame;

public abstract class View extends JFrame implements ModelListener {
	protected Bank m;
	
	//A constructor which initializes the Bank object and set the default close operation of the JFrame
	public View(Bank m) {
		this.m = m;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//Override the update method
	@Override
	public abstract void update();	
}