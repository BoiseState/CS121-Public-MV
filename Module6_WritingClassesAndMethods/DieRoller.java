/**
 * Driver for testing Die class
 * @author mvail
 */
public class DieRoller {
    public static void main(String[] args) {
        Die myDie = new Die(); //only 6 sides
        Die yourDie = new Die(8);

        int myVal = myDie.roll();
        int yourVal = yourDie.roll();

        if (myVal > yourVal) {
            System.out.println("I won! " + myVal + " beats " + yourVal + "!");
        } else if (yourVal > myVal) {
            System.out.println("You won! " + yourVal + " beats " + myVal + "!");
        } else {
            System.out.println("We tied! We both got " + myVal + ".");
        }

        //PAIR OF DICE

        PairOfDice pair = new PairOfDice(12);
        pair.roll();
        System.out.println(pair.toString());

        //test encapsulation
        Die d1 = pair.getDie1();
        System.out.println("d1: " + d1.toString());
        d1.roll();
        System.out.println("d1: " + d1.toString());
        System.out.println(pair.toString());
    }
}
