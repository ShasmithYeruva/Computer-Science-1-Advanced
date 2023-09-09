/* TODO: 02A 
The S02Product class provides methods to multiply values 
together. Right now, it only has one method:

public int product(int one, int two)

Your job is to overload the product method to allow for 
multiplying together other types of values:
1. two doubles
2. an int and a double
3. a double and an int
4. three ints
5. three doubles

Write these 5 new product methods. Every method call in 
the run method should work properly once you have 
implemented all 5 of these methods.
 */

public class S02ProductTester {

	public static void main(String[] args) {
		S02Product product = new S02Product();
		int intValue = 5;
		double doubleValue = 2.5;

		int product1 = product.multiply(intValue, intValue);
		System.out.println(product1);

		/* TODO: 02B */
		// Uncomment this code one line at a time to
		// test your code.
		// Use method overloading to define methods 
		// for each of the following method calls.

		double product2 = product.multiply(doubleValue, doubleValue);
		System.out.println(product2);

		int product3 = product.multiply(intValue, intValue, intValue);
		System.out.println(product3);

		double product4 = product.multiply(intValue, doubleValue);
		System.out.println(product4);

		double product5 = product.multiply(doubleValue, intValue);
		System.out.println(product5);

		double product6 = product.multiply(
				doubleValue, doubleValue, doubleValue);

		System.out.println(product6);

	}

}
