import javax.swing.JButton;
import javax.swing.JFrame;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame window = new JFrame();
		JButton button = new JButton();
		
		window.setSize(640, 480);
		window.setTitle("Calculator");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.add(button);
		
		button.setSize(50,50);
		button.setText("Add");
		button.setVisible(true);
		
		
	}

}
