import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutGUI extends JFrame{

	void components() {
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		add(btn5);
		add(btn1);
		add(btn3);
		add(btn6);
		add(btn4);
		add(btn2);
		add(btn7);
		add(btn8);
	}
	
	public FlowLayoutGUI() {
		// TODO Auto-generated constructor stub
		setVisible(true);
		
		setLayout(new FlowLayout());
		
		components();
		
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoutGUI();
	}

}
