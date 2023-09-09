
public class S04MathOperations {
	private double PI = 3.14159;

	public int sum(int one, int two)
	{
		// Printing Variables Example
		System.out.println("PI: " + PI);
		System.out.println("one: " + one);
		System.out.println("two: " + two);

		return one + two;
	}

	public int difference(int one, int two)
	{
		// TODO: 4B PRINT OUT VARIABLES HERE
		System.out.println("PI: " + PI);
		System.out.println("one: " + one);
		System.out.println("two: " + two);

		return one - two;
	}

	public double product(double a, double b)
	{
		double result = a * b;

		// TODO: 4C PRINT OUT VARIABLES HERE
		System.out.println("PI: " + PI);
		System.out.println("a: " + a);
		System.out.println("b: " + b);


		return result;
	}

	public double circleCircumference(int radius)
	{
		// TODO: 4D PRINT OUT VARIABLES HERE
		System.out.println("PI: " + PI);
		System.out.println("radius: " + radius);


		return 2 * radius * PI;
	}

	public double circleArea(int radius)
	{
		double area = PI * radius * radius;

		// TODO: 4D PRINT OUT VARIABLES HERE
		System.out.println("PI: " + PI);
		System.out.println("radius: " + radius);
		System.out.println("area: " + area);

		return area;
	}

}
