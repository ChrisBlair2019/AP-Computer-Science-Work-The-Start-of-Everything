/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		
		System.out.println("Deck One");
		
		String[] ranks1 = { "King", "Queen", "Ace", "Ten" }; // Create 3 arrays
																// in order to
																// suit the
																// constructor
		String[] suits1 = { "Clubs", "Hearts", "Spades", "Diamonds" };
		int[] values1 = { 10, 11, 1, 18 };
		Deck newDeck1 = new Deck(ranks1, suits1, values1);

		System.out.println("Is it Empty?" + " " + newDeck1.isEmpty());
		System.out.println();
		System.out.println("The String version of the Deck" + " "
				+ newDeck1.toString());
		System.out.println(newDeck1.deal());
		System.out.println();
		System.out.println("What is the size?" + " " + newDeck1.size());

		System.out.println();
		System.out.println("Deck Two");

		String[] ranks2 = { "Two", "Three", "Four", "Five", "Six" }; // Create 3 arrays
																// in order to
																// suit the
																// constructor
		String[] suits2 = { "Clubs", "Hearts", "Spades", "Diamonds" };
		int[] values2 = { 2,3,4,5,6};
		Deck newDeck2 = new Deck(ranks2, suits2, values2);

		System.out.println("Is it Empty?" + " " + newDeck2.isEmpty());
		System.out.println();
		System.out.println("The String version of the Deck" + " "
				+ newDeck2.toString());
		System.out.println(newDeck2.deal());
		System.out.println();
		System.out.println("What is the size?" + " " + newDeck2.size());

		System.out.println();
		System.out.println("Deck Three");

		String[] ranks3 = {  "Seven", "Eight", "Nine", "Ten", "Joker" }; // Create 3 arrays
																// in order to
																// suit the
																// constructor
		String[] suits3 = { "Clubs", "Hearts", "Spades", "Diamonds"};
		int[] values3 = { 7, 8, 9, 10, 9000};
		Deck newDeck3 = new Deck(ranks3, suits3, values3);

		System.out.println("Is it Empty?" + " " + newDeck3.isEmpty());
		System.out.println();
		System.out.println("The String version of the Deck" + " "
				+ newDeck3.toString());
		System.out.println(newDeck3.deal());
		System.out.println();
		System.out.println("What is the size?" + " " + newDeck3.size());

	}
}
//Name:Chris Blair
//School:Red Bank Catholic
//Assignment:20.4 Program it
//Date:02/10/2015