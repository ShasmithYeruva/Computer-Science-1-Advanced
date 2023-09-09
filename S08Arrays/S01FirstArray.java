/* TODO: 01 
Let’s make our first array!

Modify the following code to initialize the contents of 
firstArray to value {2, 4, 6, 8, 10}.
 */
public class S01FirstArray {
	private static int[] firstArray = {2, 4, 6, 8, 10};

	public String toString() {
		String out = "{";
		if (firstArray != null) {
			for (int x : firstArray) {
				out += x + ", ";

			}
			out = out.substring(0, out.length()-2) + "}";
		}
		return out;
	}

	public static void main(String[] args) {
		S01FirstArray a = new S01FirstArray();
		System.out.println(a);
	}
}
