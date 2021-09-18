import javax.swing.JFrame;

public class Main {
	JFrame frame = new JFrame();

	public Main() {
		// TODO Auto-generated constructor stub
		
		//setVisible untuk perlihatkan
		frame.setVisible(true);
		
		//setSize tentukan ukuran
		frame.setSize(300, 200);
		
		//setLocation tentukan lokasi muncul
		frame.setLocationRelativeTo(null);
		
		//set close untuk terminate program dan gui nya
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
