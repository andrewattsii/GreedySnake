import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Gamepannel extends JPanel implements Runnable{
	
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 500, HEIGHT = 500;
	
	
	public Gamepannel() {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}
	
	
	
	
	
	public void start() {
		
	}
	
	public void stop() {
		
	}
	public void tick() {
		
	}
	public void paint(Graphics g) {
		g.clearRect(0, 0, WIDTH, HEIGHT);
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		for(int i = 0; i < WIDTH/10; i++) {
			g.drawLine(i* 10, 0, i * 10, HEIGHT);
		}
		for(int i = 0; i < HEIGHT/10; i++) {
			g.drawLine(0, i * 10, HEIGHT, i * 10);
		}
	}




	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
