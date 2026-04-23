import javax.swing.JButton;

/**
 * Custom button that keeps track of its number of clicks.
 * @author mvail
 */
public class CustomButton extends JButton {
    private int count;
    private static final String LABEL = "Count: ";

    /** Initialize button with count 0 */
    public CustomButton() {
        count = 0;
        this.setText(LABEL + count);
    }

    /** Increment count and update button text. */
    public void increment() {
        count++;
        this.setText(LABEL + count);
    }
    
}
