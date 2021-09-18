import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main2 extends JFrame{

	public Main2() {
		// TODO Auto-generated constructor stub
		
		setVisible(true);
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		
		JLabel lblTest = new JLabel("Test GUI");
		add(lblTest);

		JButton btnTest = new JButton("Test Button");
		add(btnTest);
		
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main2();
	}

}
