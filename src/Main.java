import javax.swing.JFrame;

public class Main {

	
	public Main() {
		JFrame frame = new JFrame();
		Gamepannel gamepannel = new Gamepannel();
		
		frame.add(gamepannel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Snake");
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);

	}
	
	public static void main(String[] args) {
			new Main();
	}

}
