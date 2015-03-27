import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	private List<Card> cards;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		
		cards = new ArrayList<Card>(); 									//Create ArrayList that will house all the Cards
		for(int x = 0; x < ranks.length;x++) 							//Loop until x surpasses the length of rank
			for(String indexOfSuits : suits) 							//Scans the suit Array and creates String representations of each of the suits to be assigned independently
				cards.add(new Card(ranks[x],indexOfSuits,values[x])); 	//Finally this is the constructor that will index all of the cards in the loop assigning them each a rank and a point values
																	 	//Also gives each card that possesses a rank any number of suits inputted (IE, King of Hearts, King of Clubs, King of spades) this is due tot he enchanced for loop	
		shuffle(); 														//Invokes the Shuffle method, which will be defined in a later lab
		size = cards.size(); 											//Defines instances variable "size" as the size of the cards ArrayList
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		
		if(size==0) 													//Simply put, this just checks if the size of the deck, was evaluated in the constructor method to be zero.
		{
			return true;												//If the size is zero true is returned as the result
		}
		
		else
			return false;												//In all other instances where size isn't zero, it is returned false
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		
		return size; 													//This method merely returns the size that was declared in the constructor method
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		
		if(isEmpty()) 													//If the deck is empty, a null value will be returned
		{
			return null;
		}
		else
			size--;													 	//Size decrements as the cards are being dealt, it is both keeping track of the amount of cards dealt also keeping track of the current amount of undealt cards also.
			return cards.get(size);
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn;
		return rtn;
	}
}
//Name:Chris Blair
//School:Red Bank Catholic
//Assignment:20.4 Program it
//Date:02/10/2015
