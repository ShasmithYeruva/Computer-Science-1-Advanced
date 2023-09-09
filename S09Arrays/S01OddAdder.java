/* TODO: 01
 * In this exercise, use an enhanced for-each loop to add all the 
 * elements that are odd.
 */

public class S01OddAdder {
	public static int addOdds(int[] array) {
		int y = 0;
		// Create enhanced for loop here.
		for(int number: array) 
		{
			if (number % 2 != 0) {
				y += number;
			}
		}
		return y;
	}

	public static void main(String[] args)
	{
		int[] values1 = {17, 34, 56, 2, 19, 100, 101};
		System.out.println(addOdds(values1));
		int[] values2 = {34, 56, 2, 100};
		System.out.println(addOdds(values2));
		int[] values3 = {17, 19, 101};
		System.out.println(addOdds(values3));
	}
}