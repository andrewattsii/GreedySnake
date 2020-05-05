import javax.swing.JFrame;

public class Main {

	
	public Main() {
		JFrame frame = new JFrame();
		Gamepannel gamepannel = new Gamepannel();
		
		frame.add(gamepannel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Snake");
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
			new Main();
	}

}
