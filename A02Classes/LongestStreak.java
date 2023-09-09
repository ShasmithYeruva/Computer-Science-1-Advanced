
/* In this program we are going to extend the Coin Flips program from earlier.
 * Now we will simulate flipping a coin FLIPS times, printing out the result 
 * of each flip (either “Heads” or “Tails”), but at the end we will print out
 *  the longest streak of heads.
 *  For example, if we set FLIPS = 10; a run may output the following:
 *  Heads
 *  Heads
 *  Tails
 *  Heads
 *  Tails
 *  Tails
 *  Heads
 *  Heads
 *  Heads
 *  Heads
 *  Longest streak of heads: 4
 */

public class LongestStreak {

	public static void main(String[] args) {
		int flipped = 0;
		int heads = 0;
		int tails = 0;
		int flips = 10;
		int longest = 0;
		int streak = 0;
		while(flipped < flips) {		
			boolean random = Randomizer.nextBoolean();
			flipped = flipped + 1;
			if(random) {
				System.out.println("Heads!");
				heads++;
				streak++;
			}
			else if (! random){
				System.out.println("Tails!");
				tails++;
				if(longest < streak) {
					longest = streak;
					streak = 0;
				}
				else {
					streak = 0;
				}
			}

		}
		System.out.println("heads: " + heads);
		System.out.println("tails: " + tails);
		System.out.println("heads percent: 0." + heads);
		System.out.println("tails percent: 0." + tails);
		System.out.println("Longest streak of heads: " + longest);
	}

}
