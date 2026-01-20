/**
 * Methods needed to interact with a standard deck of playing cards.
 * @author mvail
 */
public interface DeckOfCardsInterface {
    /**
     * Gather all dealt and undealt cards back into the
     * deck and randomly reorder them.
     */
    public void shuffle();

    /**
     * Return the next undealt card. This card cannot be
     * dealt again until the deck it reshuffled.
     * @return next undealt card or null if all cards have been dealt
     */
    public Card deal();

    /**
     * Return number of cards already dealt.
     * @return number of dealt cards
     */
    public int numDealtCards();

    /**
     * Return number of undealt cards remaining in the deck.
     * @return number of undealt cards
     */
    public int numUndealtCards();
}
