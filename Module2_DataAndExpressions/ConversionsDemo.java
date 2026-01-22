/**
 * Demonstrate widening (automatic) and narrowing (with casting) conversions.
 * @author mvail
 */
public class ConversionsDemo {
    public static void main(String[] args) {
        /*
         * Roughly speaking, you can think of the hierarchy of numeric type "sizes" as:
         *
         * Biggest  double (Caution: see note, below)
         *          float  (Caution: see note, below)
         *          long
         *          int
         *          short
         * Smallest byte
         * 
         * While the floating point types are considered "wider" than longs and assignment
         * of a long to either float or double happens automatically with no warning, there
         * is a real danger of losing significant digits. Remember that the limitation of
         * floats and doubles is how many significant digits they can hold, not so much the
         * range of value magnitudes.
         */

        int int1 = 10;      //valid assignment of int literal to int variable
        long long1 = int1;  //automatic valid widening conversion of int to long

        //int int2 = 3.14;    //invalid narrowing conversion from double to int
        int int2 = (int)3.14; //using cast to force the compiler to do a narrowing conversion
        System.out.println("3.14 stored in an int: " + int2);

        long long2 = 9876543210L; //assigning a long literal (with 'L')
        //int int3 = long2; //invalid narrowing cast from long to int
        int int3 = (int)long2; //using a cast to force the compiler to do narrowing conversion
        //but did it work?
        System.out.println("Trying to cast " + long2 + " to an int: " + int3);
        //nope - truncation made it weird - value of long was outside valid int range
        double dbl1 = long2; //automatic valid conversion from long to double, even though it's possible to lose some significant digits
        System.out.println("Trying to assign " + long2 + " to a double: " + dbl1);
        float float1 = long2; //automatic valid (though risky) conversion of long to float
        System.out.println("Trying to assign " + long2 + " to a float: " + float1);
        //significant digits were lost!!! only 7 significant digits remained in the float

        long long3 = 234567890L;
        int int4 = (int)long3; //trying to cast a long to an int, again
        //will it work this time?
        System.out.println("Trying to cast " + long3 + " to an int: " + int4); //truncation made it weird

        int int5 = 'a'; //shockingly valid conversion from char to int (don't actually do this)
        System.out.println("'a' assigned to an int: " + int5);
        char char1 = (char)('a' + 13); //casting from an int to a char after "character math"
        System.out.println("'a' + 13 = '" + char1 + "'");

        //boolean isItTrue = "true"; //invalid assignment of String to boolean
        //boolean isItTrue = (boolean)"true"; //invalid cast of String to boolean
        //there IS a way to figure out a boolean from Strings "true" and "false" using the Boolean wrapper class
        boolean isItTrue = Boolean.parseBoolean("true"); //not a conversion or a cast, but simply recognizes if the String is "true" or "false"
        //boolean isItTrue = 1; //invalid assignment of int to boolean
        //boolean isItTrue = (boolean)1; //invalid cast of int to boolean
        //booleans are booleans, not numbers - you can't convert numbers to booleans
    }
}
