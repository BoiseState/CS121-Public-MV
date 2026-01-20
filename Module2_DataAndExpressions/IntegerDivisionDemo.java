/**
 * This class demonstrates integer division, modulus (remainder) division,
 * String concatenation with ints, and difference between print and println.
 */
public class IntegerDivisionDemo {
    public static void main(String[] args) {
        int numCookies = 12;
        int numFriends = 5;

        int cookiesPerFriend = numCookies / numFriends; //integer division
        int cookiesLeftOver = numCookies % numFriends;  //modulus division

        System.out.print("cookiesPerFriend = " + cookiesPerFriend); //print stays on same line
        System.out.println(" with " + cookiesLeftOver + " cookies left over."); //println ends this line
    }
}
