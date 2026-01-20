import java.util.Scanner;

/**
 * Demonstrate a console menu using switch statement.
 * 
 * @author mvail
 */
public class SwitchMenuDemo {
    public static void main(String[] args) {

        final String MENU = "(Q)uit\n"
                + "(J)oke\n"
                + "(M)enu\n"
                + "(A)verage\n";

        final String PROMPT = "Please enter your choice (or 'M' for menu): ";

        String input = "M";

        // ONLY EVER ONE SCANNER CONNECTED TO KEYBOARD IN A PROGRAM!
        Scanner kbd = new Scanner(System.in);

        while (!input.equals("Q")) {
            switch (input) {
                case "J":
                    System.out.println("Oh, wait... I don't know any jokes...");
                    break;
                case "M":
                    System.out.println(MENU);
                    break;
                case "A":
                    int numValues = 0;
                    double sum = 0;
                    String numPrompt = "Enter a number to add to the running sum. (Enter nothing to end the running sum.): "; 
                    System.out.print(numPrompt);
                    String numInput = kbd.nextLine().strip();
                    while (numInput.length() > 0) {
                        sum += Double.parseDouble(numInput);
                        numValues++;
                        System.out.print(numPrompt);
                        numInput = kbd.nextLine().strip();
                    }
                    System.out.println("Average: " + (sum/numValues));
                    break;
                default:
                    System.out.println("That is not a valid choice. Try again.");
            }

            System.out.print(PROMPT);
            // remove leading/trailing whitespace and correct for upper/lowercase
            input = kbd.nextLine().trim().toUpperCase();

        } // end while loop

        System.out.println("Goodbye.");

        kbd.close(); // close Scanner at the very end, after no more input
    }
}
