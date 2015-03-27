/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		
		Card newCard1 = new Card("Queen", "Clubs", 6);
		Card newCard2 = new Card("Ace", "Spade", 100);
		Card newCard3 = new Card("Jack", "Hearts", 1);
		Card newCard4 = new Card("Queen", "Clubs", 6);
		
		System.out.println("Queen of clubs with a value of 6");
		System.out.println("Rank" + "=" + newCard1.rank());
		System.out.println("Suit" + "=" + newCard1.suit());
		System.out.println("Value" + "=" + newCard1.pointValue());
		System.out.println("Do they Match?" + " " + newCard1.matches(newCard2));
		System.out.println("Formatted Special Version" + ": " + newCard1.toString());
		
		System.out.println();
		
		System.out.println("Ace of spades with a value of 100");
		System.out.println("Rank" + "=" + newCard2.rank());
		System.out.println("Suit" + "=" + newCard2.suit());
		System.out.println("Value" + "=" + newCard2.pointValue());
		System.out.println("Do they Match?" +" " + newCard2.matches(newCard3));
		System.out.println("Formatted Special Version" +": "+ newCard2.toString());
		
		System.out.println();
		
		System.out.println("Jack of Hearts with a value of 1");
		System.out.println("Rank" + "=" + newCard3.rank());
		System.out.println("Suit" + "=" + newCard3.suit());
		System.out.println("Value" + "=" + newCard3.pointValue());
		System.out.println("Do they Match?" + " " + newCard3.matches(newCard1));
		System.out.println("Formatted Special Version" + ": " + newCard3.toString());
		
		System.out.println();
		
		System.out.println("Queen of clubs with a value of 6");
		System.out.println("Rank" + "=" + newCard4.rank());
		System.out.println("Suit" + "=" + newCard4.suit());
		System.out.println("Value" + "=" + newCard4.pointValue());
		System.out.println("Do they Match?" + " " + newCard4.matches(newCard1));
		System.out.println("Formatted Special Version" + ": " + newCard4.toString());
		
	}
}


//Name: Chris Blair
//School: Red Bank Catholic
//Assignment: 19.4 Program it
//Date: 2/3/2015

