/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
	
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] pointValues = {11, 12, 13};
		Deck d = new Deck(ranks, suits, pointValues);

		System.out.println("**** Original Deck Methods ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card ****");
		System.out.println("  deal: " + d.deal());
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After 1 Card Dealt ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal Remaining 5 Cards ****");
		for (int i = 0; i < 5; i++) {
			System.out.println("  deal: " + d.deal());
		}
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After All Cards Dealt ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card From Empty Deck ****");
		System.out.println("  deal: " + d.deal());
		System.out.println();
		System.out.println();

		/* *** TO BE COMPLETED IN ACTIVITY 4 *** */
		//Creates the cards for the deck
		
		String[] cardRank = {"Two", "Three" , "Four", "Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"}; 
		String[] cardSuit = {"Clubs","Hearts","Spades","Diamonds"};
		int[] cardPoints=   {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		Deck deckConstruct = new Deck(cardRank,cardSuit,cardPoints); //Construct the deck based on the declared values above
		
		System.out.println("Current String Representation pre-shuffle:");
		
		System.out.println(deckConstruct.toString());
		
		for(int x = 0; x < 11; x++) //10 Shuffles
		{
		
		deckConstruct.shuffle(); //Invokes shuffle method
		
		System.out.println("After a" +" "+ x + " " +"number of shuffles, this is the current list of cards" + deckConstruct.toString()); //Number of shuffles plus their representations
		
		}
		
		
		for(int y = 0; y < 11; y++) //Deals 10 cards 
		{
		Card pastDeal = deckConstruct.deal(); //deals a single card from the previously shuffled deck, takes a single card from the deck
		
		System.out.println("Post-Deal:" + " " + y); //Enumerates the number of deals
		
		System.out.println(pastDeal + "\n" + deckConstruct.toString()); //Displays the current deck of cards
		
		}
		
		
	}
}

//Name: Chris Blair
//School: Red Bank Catholic 
//Date:02/24/2015
//Assignment: 22.4 Program it!




