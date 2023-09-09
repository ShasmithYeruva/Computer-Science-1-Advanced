/* TODO: 03
Modify the getLastElment method to return the last element of the array.
 */
public class S03LastElement {
	public static int getLastElement(int[] array) {
		int x = 0;
		for (int i = 0; i < array.length; i++){
			x = array[i];
		}
		return x;
	}
	public static void main(String[] args) {
		int[] array1 = {1};
		int[] array2 = {1,2};
		int[] array3 = {1,2,3,4,5,6,6,7,8,8,10};
		System.out.println(getLastElement(array1));
		System.out.println(getLastElement(array2));
		System.out.println(getLastElement(array3));
	}
}
