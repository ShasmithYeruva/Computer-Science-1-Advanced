/* TODO: 02
 * Modify the getArrayLength method so that it returns the 
 * length of any array.
 */

public class S02ArrayLength {
	public static int getArrayLength(int[] array) {
		return array.length;
	}
	public static void main(String[] args) {
		int[] array1 = {};
		int[] array2 = {1};
		int[] array3 = {1,2};
		int[] array4 = {1,2,3,4,5,6,6,7,8,8,10};
		System.out.println(getArrayLength(array1));
		System.out.println(getArrayLength(array2));
		System.out.println(getArrayLength(array3));
		System.out.println(getArrayLength(array4));
	}

}
