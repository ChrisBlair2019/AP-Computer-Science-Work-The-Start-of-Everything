import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;


	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	 public ElevensBoard() {
	 	super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	 }

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		
		
		if (selectedCards.size() == 2) 
		{ 												//Selecting a pair that adds up to 11 (IE two-nine or three-eight)
			return containsPairSum11(selectedCards);		
		} 
		
		
		
		else if (selectedCards.size() == 3) 
		{											//Selecting a triplet of the Jack,Queen, and King combo
			return containsJQK(selectedCards);
		}
		
		
	
		
		else 
		{
			return false;									//If no pairs or triplets exists its proves false
		}
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		
		
		
		List<Integer> cardIndexes = cardIndexes();
			
		
		return (containsPairSum11(cardIndexes) //Returns if any of these helper methods are true otherwise it's false and the user loses
					|| containsJQK(cardIndexes));	//Without this method the game would go on indefinitely but the user would be unable to pick a card as their would be no more matches
	}

	/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 */
	private boolean containsPairSum11(List<Integer> selectedCards) 
	{
		
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		for(int index1 = 0; index1 < BOARD_SIZE; index1++  ) {
			if(cardAt(index1) != null){
				for(int index2 = index1 + 1; index2 < BOARD_SIZE; index2++){
					if((cardAt(index1).pointValue() + cardAt(index2).pointValue() == 11) && cardAt(index1) != null){
						return true;
					}
				}
			}
		}
	
		return false;
	}
	// Adds each card pairs
	// at their given
	// indexes if they
	// add up to eleven
	// they are
	// considered a pair
	// otherwise they
	// are an illegal
	// match
																									
							

		

	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	private boolean containsJQK(List<Integer> selectedCards) 
	{

		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		
		//Boolean flags to either be proven to be true and changed or remain in their current state
		//All three flags have to be proven true or else it is an illegal match
		
		boolean JackFlag = false;
		
		boolean QueenFlag = false;
		
		boolean KingFlag = false;
		
		
		for (Integer cardIndex : selectedCards) 
		{
			int cardIntIndex = cardIndex.intValue();
			if ((cardAt(cardIntIndex).rank().equals("jack")))
				JackFlag = true;

			if ((cardAt(cardIntIndex).rank().equals("queen")))
				QueenFlag = true;

			if ((cardAt(cardIntIndex).rank().equals("king")))
				KingFlag = true;
		}

		
		
		return JackFlag && QueenFlag && KingFlag;		//All three MUST resolve to to true if the pair is valid, else the pair is considered illegal
	
	
	
	}
}

//Name: Chris Blair
//School: Red Bank Catholic
//Assignment:25.3b Program it!
//Date: 3/17/2015




















