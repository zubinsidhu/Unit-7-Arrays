public class ShufflingCardsInADeck {

	public static void main(String[] args) {
		// Initialize a deck of cards
		int[] deck = new int[52];
		String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"}; 
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; 
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i; 
		}
		// Shuffle the cards
		for (int i = 0; i < deck.length; i++) {
			int idx = (int)(Math.random() * deck.length); 
			int temp = deck[i];
			deck[i] = deck[idx];
			deck[idx] = temp;
		}
		// Display the first 4 cards from the deck
		for (int i = 0; i < 4; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13]; 
			System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
		}
	}
}