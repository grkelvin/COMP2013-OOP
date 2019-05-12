import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class HistoryPanel extends JPanel {
	private Bank b;
	
	//A constructor which initializes a bank
	public HistoryPanel(Bank b) {
		this.b = b;
	}
	
	//Calculate the max total money in history
	private int historyMax(ArrayList<Integer> history) {
		int max = 0;
		for(int i : history) {
			if(i > max) {
				max = i;
			}
		}
		return max;
	}
	
	//Calculate the minimum total money in history
	private int historyMin(ArrayList<Integer> history) {
		int min = 0;
		for(int i : history) {
			if(i < min) {
				min = i;
			}
		}
		return min;
	}
	
	//Calculate the range of the history of the total money of the bank
	private int historyRange(ArrayList<Integer> history) {
		return historyMax(history) - historyMin(history);
	}
	
	//Paint the history graph
	@Override
	protected void paintComponent(Graphics g) {
		if(b.getHistory().size() <= 1) {
			return;
		}
		int min = historyMin(b.getHistory());
		int range = historyRange(b.getHistory());
		int maxX = getWidth() - 1;
		int maxY = getHeight() - 1;
		int zero = maxY + min * maxY / range;
		
		//Draw the blue horizontal “zero” axis
		g.setColor(Color.BLUE);
		g.drawLine(0, zero, maxX, zero);
		
		g.setColor(Color.RED);
		ArrayList<Integer> history = b.getHistory();
		int x = 10 * 0;
		int y = zero - history.get(0) * maxY / range;
		g.drawRect(x, y, 1, 1);
		for(int i = 1; i < history.size(); i++) {
			int currentX = 10 * i;
			int currentY = zero - history.get(i) * maxY / range;
			g.drawLine(x, y, currentX, currentY);
			x = currentX;
			y = currentY;
		}
	}
}