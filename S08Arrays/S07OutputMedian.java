import java.util.Arrays;
/* TODO: 07
Write a method that returns the median value in the array.

If the length of the array is odd, the median is the value in 
the center of the array.

If the length of the array is even, the median is the average 
of the two numbers in the center.

You may assume the array passed into this method will never be empty.

Hint: We’ve imported java.util.Arrays for you, so you have a handy 
static method on Arrays that you can use called Arrays.sort. 
 */

public class S07OutputMedian {
	public double median(int[] array) {
		Arrays.sort(array);
		if (array.length % 2 == 0) {

			return ((array[array.length / 2]) + (array[array.length / 2 - 1])) / 2;
		}
		return array[(array.length - 1) / 2];
	}

	public static void main(String[] args) {
		S07OutputMedian  om = new S07OutputMedian();
		int array1[] = new int[]{10, 70, 80, 90, 70, 50};
		System.out.println(om.median(array1));
		int array2[] = new int[]{80, 80, 90, 80, 70};
		System.out.println(om.median(array2));
		int array3[] = new int[]{100, 100, 70, 40, 80, 90};
		System.out.println(om.median(array3));
	}
}