import java.util.Scanner;

/**
 * Demo use of String methods
 * @author mvail, Java Foundations
 */
public class StringMethods {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in); //get a keyboard Scanner

        System.out.print("Enter some text with leading and/or trailing whitespace: "); //prompt for input
        
        String input = kbd.nextLine(); //read full line of keyboard input
        System.out.println("You entered: \"" + input + "\"."); //show input with leading/trailing whitespace
        System.out.println("Input length: " + input.length());

        input = input.strip(); //remove all leading and trailing whitespace from input
        System.out.println("Input trimmed: \"" + input + "\""); //show trimmed input
        System.out.println("Input length: " + input.length());

        String inputToUpper = input.toUpperCase(); //get an all upper-case version of input
        System.out.println("Input converted to all caps: " + inputToUpper);

        System.out.println("Original input: " + input); //original input remains unchanged

        kbd.close();

        //common way to initialize a String using a literal
        String string1 = "This is a String."; //IMPLICITLY calls String constructor, as below
        String string2 = new String("This is a String."); //EXACTLY the same as above

        System.out.println("String from literal: " + string1);
        System.out.println("String from constructor: " + string2);
        System.out.println("String length: " + string1.length());
        System.out.println("First character: " + string1.charAt(0));
        System.out.println("Last character: " + string1.charAt(string1.length()-1));
        int spaceIndex1 = string1.indexOf(' ');
        String firstWord = string1.substring(0, spaceIndex1);
        System.out.println("First word: " + firstWord);
        System.out.println("The rest of the string: " + string1.substring(spaceIndex1+1));
        System.out.println("String toUpperCase: " + string1.toUpperCase());
        System.out.println("Was the original String changed? " + string1);
        System.out.println("Excited String: " + string1.replace('.', '!'));

        /*
         * Examples from "StringPlay" from Java Foundations
         */
        String phrase = "Change is inevitable";
		String s1 = null, s2, s3, s4;

		System.out.println("Original string: \"" + phrase + "\"");
		System.out.println("Length of string: " + phrase.length());
		//System.out.println("Length of string: " + s1.length());

		s1 = phrase.concat(", except from vending machines.");
		s2 = s1.toUpperCase();
		s3 = s2.replace('E', 'X');
		s4 = s3.substring(3, 30);

		// Print each mutated string
		System.out.println("Mutation #1: " + s1);
		System.out.println("Mutation #2: " + s2);
		System.out.println("Mutation #3: " + s3);
		System.out.println("Mutation #4: " + s4);

		System.out.println("Mutated length: " + s4.length());
    }
}