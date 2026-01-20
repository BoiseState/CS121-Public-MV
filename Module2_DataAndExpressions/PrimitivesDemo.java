/**
 * This driver class (a class with a main() method that represents the program itself)
 * is demonstrating some basic primitive variable declarations, assignments, and
 * expressions.
 * 
 * (This style of comment is called a Javadoc. Every class and method should have a
 * javadoc with a description and any appropriate tags. This class javadocs includes
 * an author tag, as all class javadocs should.)
 * 
 * @author mvail
 */
public class PrimitivesDemo {
    public static void main(String[] args) {
        /*
         * Numeric primitive variables
         *
         * (This comment is a regular block comment. The format is subtly different
         * from a javadoc. Javadocs start with /** (slash and two asterisks) and
         * regular block comments start with /* (slash and one asterisk). Both end
         * with a single asterik and slash. Javadoc comments are only appropriate
         * before a class or method header and, occassionally, some variables and
         * constants that we haven't learned about, yet. Regular block comments
         * and line comments can be used inside methods.)
         */
        int firstInt;       //declaration of a new int variable called firstInt
        firstInt = 10;      //assignment of a value to firstInt
        int secondInt = 3;  //declaration and assignment in one: initialization

        // This is a line comment. Anytime you have two slashes // the compiler
        // ignores everything that follows. Line comments can be on their own
        // line of the program, like these are, or they can follow a line of code.

        // A lot is going on in the following initialization statement. On the
        // right side of the = assignment operator, an expression is adding the 
        // current value of firstInt to the current value of secondInt. The result
        // of this sum is then assigned to a new int variable.
        // Assignment is always from the right side of an '=' to the left and
        // everything to the right happens before the resulting value is used.
        int sum = firstInt + secondInt; // line comment following a statement

        // This statement concatenates our primative int variables with some
        // short String literals inside the parentheses, then passes the resulting
        // String to the System.out.println() method to diplay the result to the
        // console/terminal accessed by System.out.
        System.out.println(firstInt + " + " + secondInt + " = " + sum);

        // The division in this expression is an integer division - both numerator and
        // denomenator are integers and the result is only the whole part of the result.
        System.out.println(firstInt + " / " + secondInt + " = " + (firstInt / secondInt));
        //The modulus division in this expression returns the remainder of the integer division.
        System.out.println(firstInt + " % " + secondInt + " = " + (firstInt % secondInt));

        //int badPi = 3.14; //an invalid narrowing assignment of a double to an int -
                            // any numeric literal with a decimal point is a double by default

        double decentPi = 3.14159; //a valid assignment of a double literal to a double variable

        double notPi = 3;   //valid widening conversion of an int literal to a double -
                            // it is valid to assign a smaller/less precise value like an int
                            // to a larger/more precise value like a double

        /*
         * Boolean primitive variables
         */

        //boolean notValid = "true"; //an invalid assignment of a String to a boolean

        boolean isValid = true; //true and false are reserved words and the only valid boolean values

        /*
         * Character primitive variables
         */

        char firstChar = 'a'; //characters use single quotes
        
        //char badChar = "a"; //invalid assignment of a String to a char

        int firstCharValue = firstChar; //valid automatic conversion of char to int -
                                        //a char is actually a number that corresponds
                                        //to a specific location in the Unicode character
                                        //set - when you use a char, you're referencing
                                        //one of ober 16,000 symbols

        System.out.println("'" + firstChar + "' numeric value is " + firstCharValue);

        char secondChar = (char)(firstChar + 1); //character math!

        System.out.println("'" + firstChar + "' + 1 is '" + secondChar + "'");

        char pi = '\u03C0'; //accessing a Unicode char by its hexadecimal number
        System.out.println("pi symbol: " + pi); //concatenating a String and a char from Unicode set
        //pi = 3.14; //characters are not and cannot be floating point values
    }
}