import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Demo basic features of an event-driven GUI.
 * @author Java Foundations, mvail
 */
public class PushCounterUpDownPanel extends JPanel {
    private int pushCount;      //needed in listener
    private JLabel label;       //needed in listeners or elsewhere after the constructor should be instance variables
    private JButton upButton;   //needed in listener
    private JButton downButton; //technically not needed in listener because of how we wrote the if condition
    private static final String LABEL = "Pushes: ";
	
	/**
	 * Initializes the buttons and preview panel and adds the listener
	 * to all of the buttons.
	 */
	public PushCounterUpDownPanel()
	{
        pushCount = 0;

        //initialize components
        label = new JLabel(LABEL + pushCount);
        upButton = new JButton("Increase Count");
        downButton = new JButton("Decrease Count");

        //connect listeners
        ActionListener buttonListener = new PushButtonListener();
        upButton.addActionListener(buttonListener);
        downButton.addActionListener(buttonListener);

        //add components to this panel
        this.add(upButton);
        this.add(downButton);
        this.add(label);
	}

    /**
     * Listener for "Push Me" button.
     */
    private class PushButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //if listener is shared by more than one source, find out
            // which so you can respond appropriately
            JButton sourceButton = (JButton) e.getSource();
            if (sourceButton == upButton) {
                pushCount++;
            } else {
                pushCount--;
            }
            label.setText(LABEL + pushCount);
        }
        
    }
}
