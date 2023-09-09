
public class S02Pentagon extends S02Shape {
	private double sideLength;

	public S02Pentagon(String name, double sideLength)
	{
		super(name);
		this.sideLength = sideLength;
	}

	public S02Pentagon(double sideLength)
	{
		this("Pentagon", sideLength);
	}

	public double getSideLength()
	{
		return sideLength;
	}

	public double getArea()
	{
		return 1.0 / 4.0 * Math.sqrt(5.0 * (5.0 + 2.0 * Math.sqrt(5.0)))
				* Math.pow(sideLength, 2);
	}
	public double getPerimeter() {
		return 5 * sideLength;
	}
}
