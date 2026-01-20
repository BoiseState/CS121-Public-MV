/**
 * Demonstrate some alternate ways to calculate the sum of even numbers
 * and odd numbers within a range, using for loops.
 * There are many ways to get correct results, but some solutions
 * are better than others. Clear, easy-to-understand, and reasonably
 * efficient solutions are best.
 * 
 * @author mvail
 */
public class NestedForEvenOddSums {
    public static void main(String[] args) {
        /*
         * Declare variables for sum of evens and sum of odds.
         */
        int evenSum;// if you want variables to exist after a loop
        int oddSum; // they have to be declared before the loop

        /*
         * OPTION 1
         * This is pretty straightforward, but not very efficient
         * because we have two loops going through the exact same
         * range of even AND odd numbers. Every number has to be
         * checked to see if it's the kind we want.
         */
        evenSum = 0;//initialize before loops
        oddSum = 0; //initialize before loops
        for (int i = 10; i <= 100; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        for (int i = 10; i <= 100; i++) {
            if (i % 2 == 1) {
                oddSum += i;
            }
        }
        System.out.println("OPTION 1 RESULTS");
        System.out.println("EvenSum: " + evenSum);
        System.out.println("OddSum: " + oddSum);

        /*
         * OPTION 2
         * This is actually the most efficient version because it only
         * goes through each value once and doesn't have to check to
         * see if values are even or odd. The only downside is that it
         * isn't the most obvious solution using two loops with different
         * ranges.
         */
        evenSum = 0;//initialize before loops
        oddSum = 0; //initialize before loops
        for (int i = 10; i <= 100; i+=2) { //only go through evens
            evenSum += i;
        }
        for (int i = 11; i < 100; i+=2) { //only go through odds
            oddSum += i;
        }
        System.out.println("OPTION 2 RESULTS");
        System.out.println("EvenSum: " + evenSum);
        System.out.println("OddSum: " + oddSum);

        /*
         * OPTION 3
         * This is arguably the best option. It only goes through
         * the range once and figures out whether to add the current
         * value to the evenSum or oddSum in a single loop. Relatively
         * efficient, and easy to understand.
         */
        evenSum = 0;//initialize before loops
        oddSum = 0; //initialize before loops
        for (int i = 10; i <= 100; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println("OPTION 3 RESULTS");
        System.out.println("EvenSum: " + evenSum);
        System.out.println("OddSum: " + oddSum);

        /*
         * OPTION 4
         * This is as efficient as Option 3, but less clear. If it isn't
         * obvious how it works, you have to ask why you're doing it.
         * Follow the "KISS" principle: "Keep It Simple, Stupid". Use the
         * simplest solution that is acceptibly efficient.
         */
        evenSum = 0;//initialize before loops
        oddSum = 0; //initialize before loops
        for (int i = 10; i <= 100; i += 2) { // only go through even numbers
            evenSum += i;
            if (i != 100) { // unless it's the last value in the range,
                oddSum += i + 1; // every even is followed by an odd...
            }
        }
        System.out.println("OPTION 4 RESULTS");
        System.out.println("EvenSum: " + evenSum);
        System.out.println("OddSum: " + oddSum);
    }
}