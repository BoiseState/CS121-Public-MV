import java.util.Random;

/**
 * A single Die for games.
 * @author mvail
 */
public class Die {
    //instance variables / attributes
    private int numSides;
    private int faceValue;

    //shared class constant
    public static final int DEFAULT_SIDES = 6; //static so it's universal and shared by all Die objects

    //constructor(s)
    
    /**
     * Initialize Die with given number of sides.
     * @param numSides
     */
    public Die(int numSides) { //in parentheses is the "formal parameter list"
        this.numSides = numSides; //assigning local numSides value to instance var numSides
        this.faceValue = roll(); //start with a random faceValue
    }

    /**
     * Initialize Die with default number of sides.
     */
    public Die() { //"default constructor" that uses default values
        // this.numSides = DEFAULT_SIDES; //using named constant instead of numeric literal
        // this.faceValue = 1;
        this(DEFAULT_SIDES); //this constructor is calling the other constructor
    }

    //methods / behaviors

    /** @return number of sides */
    public int getNumSides() {
        return numSides;
    }

    /** @return current face value */
    public int getFaceValue() {
        return faceValue;
    }

    /**
     * Set Die face value to given value if valid.
     * @param newFaceValue
     * @return true if given face value was valid, else false
     */
    public boolean setFaceValue(int newFaceValue) {
        if (newFaceValue > 0 && newFaceValue <= numSides) { //"validation"
            faceValue = newFaceValue;
            return true;
        } else { //invalid new value
            return false;
        }
    }

    /**
     * Roll Die to get a new random face value.
     * @return new face value
     */
    public int roll() {
        Random rand = new Random();
        faceValue = rand.nextInt(numSides) + 1;
        return faceValue;
    }
}
