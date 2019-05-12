public class ViewHistory extends View {
	private ControllerHistory c;
	
	//A constructor which initializes a bank and a controller
	public ViewHistory(Bank m, ControllerHistory c) {
		super(m);
		this.c = c;
		this.setSize(400, 300);
		this.add(new HistoryPanel(m));
		this.setVisible(true);
	}

	//Repaint the graph
	@Override
	public void update() {
		repaint();
	}
}