package elevensboard;

/**
 * This is a class that tests the Card class.
 */
public class CardTester
{
    /**
     * The main method in this class checks the Card operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args)
    {
        Card card1 = new Card("8", "Clubs", 8);
        Card card2 = new Card("King", "Hearts", 13);
        Card card3 = new Card("8", "Clubs", 8);
        System.out.println("Card 1: " + card1.rank() + " of " + card1.suit() + " (point value = " + card1.pointValue() + ")");
        System.out.println("Card 2: " + card2.toString());
        System.out.println("Card 3: " + card3.toString());
        System.out.println("Card 1 and Card 2 should not match: " + !card1.matches(card2));
        System.out.println("Card 1 and Card 3 should match: " + card1.matches(card3));
    }
}
