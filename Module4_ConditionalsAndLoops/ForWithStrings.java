/**
 * Examples using for loops with Strings.
 * 
 * @author CS121 Instructors
 */
public class ForWithStrings {
    public static void main(String[] args) {
        /*
         * Loop that prints each character of a String,
         * one char per line.
         */
        String input = "A String";
        System.out.println("\"" + input + "\" with one char per line is:");
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }
        System.out.println(); //blank line

        /*
         * Loop that builds a String from alternating
         * chars from another String.
         */
        String sourceString = "Arnon";
        String newString = "";
        for (int i = 0; i < sourceString.length(); i += 2) {
            newString += sourceString.charAt(i);
        }
        System.out.println("Keeping only even indexed chars from \"" + sourceString + "\" results in \"" + newString + "\"");
        System.out.println(); //blank line

        /*
         * Loop that reverses the chars in a source String.
         */
        String word = "spoons";
        String reversedWord = "";
        for (int i = word.length()-1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        System.out.println("\"" + word + "\" reversed is \"" + reversedWord + "\"");
        System.out.println(); //blank line
    }
}
