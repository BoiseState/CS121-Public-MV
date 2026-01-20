/**
 * Manages a pair of Die objects.
 * @author mvail
 */
public class PairOfDice {
    private Die die1; //uninitialized until constructor is called
    private Die die2; //they're both null until initialized

    //CONSTRUCTORS

    /** Create dice with default number of sides. */
    public PairOfDice() {
        die1 = new Die();
        die2 = new Die();
    }

    /**
     * Create dice with given number of sides.
     * @param numSides
     */
    public PairOfDice(int numSides) {
        die1 = new Die(numSides);
        die2 = new Die(numSides);
    }

    // METHODS

    /**
     * Get sum of dice values.
     * @return current total of both dice
     */
    public int getTotalFaceValue() {
        return die1.getFaceValue() + die2.getFaceValue();
    }

    /**
     * Roll both dice and return the new total.
     * @return sum of rolled dice
     */
    public int roll() {
        die1.roll();
        die2.roll();
        //can call my own method if I don't want to duplicate calculations
        return this.getTotalFaceValue(); 
    }

    @Override
    public String toString() {
        String str = "PairOfDice: d1=" + die1.getFaceValue() + " of " + die1.getNumSides()
            + ", d2=" + die2.getFaceValue() + " of " + die2.getNumSides()
            + ", Total=" + this.getTotalFaceValue();
        return str;
    }

    /**
     * Example getter making a copy of my Die object for safety.
     * @return copy of die1
     */
    public Die getDie1() {
        //return die1; //BREAKS ENCAPSULATION of PairOfDice!
        Die d1Copy = new Die(die1.getNumSides());
        d1Copy.setFaceValue(die1.getFaceValue());
        return d1Copy; //keeps MY die1 safe - MY die1 can't be changed by someone else
    }

    /**
     * Example of a better getter that gives the info user probably wanted
     * with no risk of encapsulation violation.
     * @return die1's face value
     */
    public int getDie1FaceValue() { //better getter - no risk to encapsulation
        return die1.getFaceValue();
    }
}
