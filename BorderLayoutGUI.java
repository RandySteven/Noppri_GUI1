import java.awt.BorderLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BorderLayoutGUI extends JFrame{

	void components() {
		JPanel northPanel = new JPanel();
		JLabel lblNorth = new JLabel("This is label north");
		JButton btnNorth = new JButton("NORTH");
		JButton btnCenter = new JButton("CENTER");
		JButton btnSouth = new JButton("SOUTH");
		JButton btnEast = new JButton("EAST");
		JButton btnWest = new JButton("WEST");
		
		northPanel.add(lblNorth);
		northPanel.add(btnNorth);
		add(northPanel, BorderLayout.NORTH);
		add(btnCenter, BorderLayout.CENTER);
		add(btnSouth, BorderLayout.SOUTH);
		add(btnEast, BorderLayout.EAST);
		add(btnWest, BorderLayout.WEST);
		
//		add(btnNorth, BorderLayout.PAGE_START);
//		add(btnCenter, BorderLayout.CENTER);
//		add(btnSouth, BorderLayout.PAGE_END);
//		add(btnEast, BorderLayout.LINE_END);
//		add(btnWest, BorderLayout.LINE_START);
	}
	
	public BorderLayoutGUI() {
		setVisible(true);
		
		setLayout(new BorderLayout());
		
		components();		
		
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayoutGUI();
	}

}
