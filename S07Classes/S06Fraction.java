/* TODO: 06B
 * Uncomment code and implement class.
 */
public class S06Fraction implements  Comparable<S06Fraction>{
	private int numerator;
	private int denominator;

	public S06Fraction(int numer, int denom) {
		numerator = numer;
		denominator = denom;
	}


	public int compareTo(S06Fraction other) {
		int diff = (numerator * other.denominator) - (other.numerator * denominator);
		return (int)Math.signum(diff);
	}

	public boolean equals(Object other) {
		S06Fraction obj = (S06Fraction) other;
		return compareTo(obj) == 0;

	}

}
