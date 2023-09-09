/* Write a program to simulate flipping 100 coins. Print out the result 
 * of every flip (either Heads or Tails).
 * At the end of the program, print out how many heads you flipped, 
 * how many tails you flipped, what percentage were heads, and what percentage were tails.
 * Sample Output:
 * Heads
 * Tails
 * Tails
 * ... Heads
 * Heads: 52
 * Tails: 48
 * % Heads: 0.52
 * % Tails: 0.48
 * 
 */
public class CoinFlips {

	public static void main(String[] args) {
		int flipped = 0;
		int heads = 0;
		int tails = 0;

		while(flipped < 100) {		
			boolean random = Randomizer.nextBoolean();
			flipped = flipped + 1;
			if(random) {
				System.out.println("Heads!");
				heads++;
			}
			else if (! random){
				System.out.println("Tails!");
				tails++;
			}

		}
		System.out.println("heads: " + heads);
		System.out.println("tails: " + tails);
		if(tails < 10) {
			System.out.println("heads percent: 0.0" + heads);
		}
		if(heads < 10) {
			System.out.println("tails percent: 0.0" + tails);
		}		
		if (heads > 9) {
			System.out.println("heads percent: 0." + heads);
		}
		if (tails > 9) {
			System.out.println("tails percent: 0." + tails);
		}
	}

}


