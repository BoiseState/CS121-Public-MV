import javax.swing.JFrame;

/**
 * Driver class for custom button demo.
 * @author mvail
 */
public class CustomButtonDemo {

	/** @param args unused */
	public static void main(String[] args) {
		JFrame frame = new JFrame("Custom Button");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CustomButtonPanel panel = new CustomButtonPanel();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}

}
