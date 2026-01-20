import java.util.Scanner;

/**
 * This is a javadoc comment.
 * It should describe the class or method that comes next.
 * 
 * e.g.
 * This class includes code to demonstrate use of a Scanner for
 * reading keyboard input.
 * 
 * @author mvail
 * @author meToo
 */
public class KeyboardScannerDemo2 {
    public static void main(String[] args) {
        /*
         * Read text input and echo
         */
        Scanner kbd = new Scanner(System.in); //initialize a Scanner connected to the keyboard
        
        System.out.print("Enter a sentence: "); //prompt for input

        String input = kbd.nextLine(); //always read a whole line from kbd
        
        //It is a very good idea to strip() leading and trailing whitespace
        //characters from keyboard input. People have a tendency to add
        //extra spaces before or after things they type by accident and you
        //don't want leading or trailing spaces or tabs in most input.
        //The above statement would be modified as follows:
        //  String input = kbd.nextLine().strip();
        //This statement chains together a sequence of operations. First the
        //nextLine() is read from kbd. Then it is strip()ed of leading and
        //trailing whitespace characters. Finally, the resulting String is
        //assigned to the input variable.

        System.out.println("You said:\n" + input);

        /*
         * Read integer input
         */
        System.out.print("Enter an integer: "); //prompt so user knows what is expected
        int inputInteger = Integer.parseInt(kbd.nextLine()); //best way to read an int from kbd
        //Again - While not required, it is a good idea to strip() input:
        //  int inputInteger = Integer.parseInt(kbd.nextLine().strip());
        System.out.println("Your integer: " + inputInteger); //what did we get?

        /*
         * NOT the right way to read numeric input!
         * This seems like an obvious way to do it, and it will lead to bugs
         * in your code that will make you crazy. DON'T DO IT.
         */
        /*
        System.out.print("Enter another integer: "); //prompt
        int inputInt2 = kbd.nextInt(); //bad idea - DO NOT DO THIS!
        System.out.println("Your integer: " + inputInt2); //what did we get? so far so good, right?

        System.out.print("Enter your name: "); //next prompt
        String name = kbd.nextLine(); //expecting to get user's name
        System.out.println("Your name: \"" + name + "\""); //what did we get?
        //and this is why we don't use next(), nextInt(), nextDouble(), nextBoolean()
        //when reading from the keyboard (or, later, from files)
        System.out.println("Your name was blocked behind an unconsumed newline character.");
        */

        /*
         * Breaking up a String into tokens.
         */
        System.out.print("Enter a sentence: ");
        String sentence = kbd.nextLine(); //read a whole line at a time from keyboard

        Scanner lineScanner = new Scanner(sentence); //separate Scanner to break up one String

        String firstWord = lineScanner.next(); //safe to use when breaking up one String
        String secondWord = lineScanner.next();
        System.out.println("First two words were: " + firstWord + " " + secondWord);

        lineScanner.close(); //close Scanners when you're done with them

        System.out.print("Enter an int and a double: ");
        String intAndDouble = kbd.nextLine();

        Scanner numberScanner = new Scanner(intAndDouble); //separate Scanner for one String

        int theInt = numberScanner.nextInt(); //safe because we're breaking up one String
        double theDouble = numberScanner.nextDouble(); //safe for one String

        System.out.println("The int: " + theInt + " and the double: " + theDouble);

        numberScanner.close(); //done with numberScanner

        kbd.close(); //done with keyboard Scanner
    }
}