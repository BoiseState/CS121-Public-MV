import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

/**
  Demonstrates the use of a file chooser and a text area.
  @author CS121 Instructors
 */
@SuppressWarnings("serial")
public class FileChooser extends JPanel
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Display File");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new FileChooserPanel());
		frame.pack();
		frame.setVisible(true);
	}
}
