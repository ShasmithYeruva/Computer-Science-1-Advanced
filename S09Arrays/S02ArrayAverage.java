/* TODO: 02
 * Modify the getArrayAverage method so that it returns the 
 * average of the array. Must use an enhanced for-each loop.
 */

public class S02ArrayAverage {

	public static double getArrayAverage(int[] array) {
		double x = 0;
		for(double number: array) 
		{
			x += number;
		}
		x = x / array.length;
		return x;
	}

	public static void main(String[] args) {
		int[] values1 = {17, 34, 56, 2, 19, 100, 101};
		System.out.println(getArrayAverage(values1));
		int[] values2 = {34, 56, 2, 100};
		System.out.println(getArrayAverage(values2));
		int[] values3 = {17, 19, 101};
		System.out.println(getArrayAverage(values3));
	}
}
