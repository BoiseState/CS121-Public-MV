import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 * Panel to hold CustomButtons for CustomButtonDemo.
 * When a button is clicked, its custom method will be called.
 * @author mvail
 */
public class CustomButtonPanel extends JPanel {
    public CustomButtonPanel() {
	//ActionListener shared by all CustomButtons
        CustomButtonListener listener = new CustomButtonListener();

	//Initialize and configure CustomButtons
        CustomButton b1 = new CustomButton();
        b1.addActionListener(listener);
        CustomButton b2 = new CustomButton();
        b2.addActionListener(listener);

        //Add CustomButtons to this panel
        this.add(b1);
        this.add(b2);
    }

    /** Listener for CustomButton events. */
    private class CustomButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            CustomButton button = (CustomButton) e.getSource();
            button.increment();
        }

    }
}
