/**
 * A card from a deck of standard playing cards.
 * @author mvail
 */
public class Card implements Comparable<Card> {
    //instance variable / attributes
    //Note: Suit and FaceValue enums are defined in their own files
    private Suit suit; //Card 'has-a' Suit -> example of aggregation
    private FaceValue faceValue; //Card 'has-a' FaceValue - also aggregation

    //constructor

    /**
     * Create a new card with the given faceValue and suit.
     * @param faceValue
     * @param suit
     */
    public Card(FaceValue faceValue, Suit suit) {
        this.faceValue = faceValue;
        this.suit = suit;
    }

    /**
     * Return card's suit
     * @return suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * Return the card's face value
     * @return face value
     */
    public FaceValue getFaceValue() {
        return faceValue;
    }

    @Override
    public int compareTo(Card otherCard) {
        //"ordinal" is similar to an index, so a lower value card has a 
        //lower ordinal value than a card with a higher value
        return this.faceValue.ordinal() - otherCard.faceValue.ordinal();
    }
}
