
/* TODO: 07A
Read Overview
In this exercise, you will create a class called Fraction that represents 
a number with an integer numerator and denominator.

For example, if you want to create a Fraction to represent the number one 
half, you would write:

S07Fraction half = new S07Fraction(1, 2);
You should create the constructor, the instance variables, 
and a toString method.

Your toString method should be written such that half.toString() would 
return a String of the form "1/2". In other words, the following code:

System.out.println(half);
Should print out:

1/2 
 */
public class S07FractionTester {
	/* TODO: 07B 
	 * Test out your fraction class here!
	 * */
	public static void main(String[] args) {
		S07Fraction half = new S07Fraction(1,2);
		System.out.println(half);
	}
}
