import java.util.ArrayList;

/**
 * Collection of Cards to form a standard playing card deck.
 * @author mvail
 */
public class DeckOfCards implements DeckOfCardsInterface {
    //INSTANCE VARIABLES / ATTRIBUTES

    private ArrayList<Card> deck; //DeckOfCards 'has-a' ArrayList, and 'has-a' Card

    //SHARED CLASS CONSTANTS

    public static final int TOTAL_CARDS = 52;

    //CONSTRUCTOR(s)

    /**
     * Generates a standard deck of playing cards.
     * The deck is not shuffled, yet.
     */
    public DeckOfCards() {
        //TODO
    }

    //METHODS / BEHAVIORS

    @Override
    public void shuffle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'shuffle'");
    }

    @Override
    public Card deal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deal'");
    }

    @Override
    public int numDealtCards() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'numDealtCards'");
    }

    @Override
    public int numUndealtCards() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'numUndealtCards'");
    }
    
}
