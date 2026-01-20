import java.util.Scanner;

/**
 * Demo to show using a Scanner to read keyboard input.
 * @author mvail and you
 */
public class KeyboardScannerDemo3 {
    public static void main(String[] args) {
        //open Scanner connected to keyboard input
        Scanner kbd = new Scanner(System.in); 

        //always prompt for what you want
        System.out.print("Enter a sentence: ");
        //always read a whole line with nextLine()
        String inputString = kbd.nextLine().trim(); //program waits for you to hit Enter

        //"echo" back whatever I entered
        System.out.print("You entered:\n"); //inserted a "newline" character
        System.out.println("\"" + inputString + "\""); //used escaped "

        //prompt for an integer
        System.out.print("Please enter an integer: ");
        //the wrong way to get that integer using nextInt()
        //int inputInt = kbd.nextInt();
        //the right way to get that integer using wrapper class
        int inputInt = Integer.parseInt(kbd.nextLine());

        System.out.println("You entered: " + inputInt);

        //prompting for another String
        System.out.print("Please enter a String with a word, int, double, and another word: ");
        //try to read the string
        inputString = kbd.nextLine();

        System.out.println("You entered: \"" + inputString + "\"");

        //It's okay to use other Scanner methods on a String input
        Scanner stringScanner = new Scanner(inputString);
        String firstWord = stringScanner.next();
        int theInt = stringScanner.nextInt();
        double theDouble = stringScanner.nextDouble();
        String secondWord = stringScanner.next();

        System.out.println("First word: " + firstWord);
        System.out.println("The int: " + theInt);
        System.out.println("The double: " + theDouble);
        System.out.println("Second word: " + secondWord);
        
        //always close Scanners when you're done
        kbd.close();
    }
}
