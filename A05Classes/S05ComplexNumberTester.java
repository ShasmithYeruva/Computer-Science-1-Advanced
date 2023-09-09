
public class S05ComplexNumberTester {
	/* In this exercise, you must take your S04ComplexNumber class
	 * from earlier and extend it by adding a few handy methods.
	 * 
	 * public void add(S04ComplexNumber other)
	 * public void subtract(S04ComplexNumber other)
	 * public void multiply(S04ComplexNumber other)
	 * 
	 * Note that
	 * public void add(S04ComplexNumber other)
	 * public void subtract(S04ComplexNumber other)
	 * public void multiply(S04ComplexNumber other)
	 * are void methods. They do not return anything.
	 * These methods should not create a new 
	 * S04ComplexNumber and return it.
	 * 
	 * Instead, these methods should modify the instance variables 
	 * to be added, subtracted, or multiplied by the S04ComplexNumber other.
	 * 
	 * For example, the following code:
	 * S04ComplexNumber first = new S04ComplexNumber(1, 2);
	 * S04ComplexNumber second = new S04ComplexNumber(2, 3);
	 * 
	 * System.out.println("BEFORE:");
	 * System.out.println("first: " + first);
	 * System.out.println("second: " + second);
	 * first.multiply(second);
	 * 
	 * System.out.println("AFTER:");
	 * System.out.println("first: " + first);
	 * System.out.println("second: " + second);
	 * Should print out:
	 * BEFORE:
	 * first: 1 + 2i
	 * second:2 + 3i
	 * 
	 * AFTER:
	 * first: -4 + 7i
	 * second: 2 + 3i
	 * 
	 * Test your code to receive full credit, however, you
	 * are not required to conform to a special format.
	 */

	public static void main(String[] args) {
		/* Add test code here. */
		S04ComplexNumber first = new S04ComplexNumber(1, 2);
		S04ComplexNumber second = new S04ComplexNumber(2, 3);

		System.out.println("BEFORE:");
		System.out.println("first: " + first);
		System.out.println("second: " + second);
		first.multiply(second);

		System.out.println("AFTER:");
		System.out.println("first: " + first);
		System.out.println("second: " + second);
	}

}
