/* TODO 07 
 * Game of black jack works by each player drawing cards
 * from a deck until a hold occurs (as in no more hits)
 * or the player exceeds 21 (which is a bust).
 * If the first player busts, the second player is the winner.
 * Otherwise if the second player busts, the first player in the winner.
 * Otherwise if the first player score >= second player, first wins.
 * Otherwise second wins.
 * 
 * Your assignment is to complete the game logic.
 * */
public class S07BlackJack {
	private static String player = new String("player");
	private static String computer = new String("computer");

	public static void main(String[] args) {
		String firstPlayer = getFirstPlayer();
		String secondPlayer = getSecondPlayer(firstPlayer);
		System.out.println(firstPlayer + " goes first");
		int cardValue1 = playHand();
		System.out.println(secondPlayer + " now plays");
		int cardValue2 = playHand();
		System.out.println(firstPlayer + " " + cardValue1);
		System.out.println(secondPlayer + " " + cardValue2);
		if (cardValue1 == -1) {
			System.out.println(secondPlayer + " wins!");
		} else if (cardValue2 == -1) {
			System.out.println(firstPlayer + " wins!");
		} else if (cardValue1 >= cardValue2) {
			System.out.println(firstPlayer + " wins!");
		} else {
			System.out.println(secondPlayer + " wins!");
		}
	}


	public static boolean hitMe(double probability) {
		/*
		 * TODO: 07A Use the S07Randomizer to determine if user should take a hit based
		 * on the probability.
		 */
		boolean hitMe = S07Randomizer.nextBoolean(probability);
		return hitMe;
	}

	public static int getCardValue() {
		/*
		 * TODO: 07B Use the S07Randomizer to determine what card 1 through 11 inclusive
		 * is provided by the deck.
		 */
		int cardNumber = S07Randomizer.nextInt(1, 11);
		return cardNumber;
	}

	public static String getFirstPlayer() {
		String firstPlayer = "";
		/*
		 * TODO: 07C Use the S07Randomizer to determine what player should go first
		 * player or computer. These are already defined as static instance variables.
		 */
		boolean isPlayer = S07Randomizer.nextBoolean();
		if (isPlayer) {
			firstPlayer = player;
			return firstPlayer;
		} else {
			firstPlayer = computer;
			return firstPlayer;
		}
	}

	public static String getSecondPlayer(String firstPlayer) {
		String secondPlayer = "";
		/*
		 * TODO: 07D Write logic to use the information from the first player to
		 * determine the second player.
		 */

		if(firstPlayer.equals(player)) {
			secondPlayer = computer;
			return secondPlayer;
		} else {
			secondPlayer = player;
			return secondPlayer;
		}
	}

	public static int playHand() {
		int totalCardValue = 0;
		/* TODO: 07E
		 * This is a half while loop, add the logic
		 * as follows
		 * 1) Start the while loop
		 * 2)     Get a card and add it to the total cards
		 * 3)     If over 21 that is bust,
		 *           set total card value = -1 
		 *           exit loop
		 * 4)     Determine the hitProbability by the 
		 *        formula (21 - totalCardValue) / 21.0
		 *        if hit is false
		 *           exit loop
		 */
		while(totalCardValue < 21) {
			int cardNew;
			cardNew = S07BlackJack.getCardValue();
			totalCardValue += cardNew;
			if(totalCardValue > 21) {
				totalCardValue = -1;
				break;
			}
			else if(S07BlackJack.hitMe((21 - totalCardValue) / 21)) {
				break;
			}
		}
		return totalCardValue;

	}
}