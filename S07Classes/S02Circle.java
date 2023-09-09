
public class S02Circle extends S02Shape {

	private double radius;

	public S02Circle(String name, double radius)
	{
		super(name);
		this.radius = radius;
	}

	public S02Circle(double radius)
	{
		this("Circle", radius);
	}

	public double getRadius()
	{
		return radius;
	}

	public double getArea()
	{
		return Math.PI * Math.pow(radius, 2);
	}
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
}
