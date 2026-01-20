/**
 * Driver for testing Card and DeckOfCards
 * @author mvail
 */
public class DrawTwo {
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards(); //DrawTwo 'depends on' DeckOfCards
        deck.shuffle();

        Card card1 = deck.deal(); //DrawTwo 'depends on' Card
        Card card2 = deck.deal();

        if (card1.compareTo(card2) < 0) { //card1 < card2
            System.out.println("Player 2 wins!");
        } else if (card1.compareTo(card2) > 0) { //card2 < card1
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("It's a tie.");
        }
    }
}
