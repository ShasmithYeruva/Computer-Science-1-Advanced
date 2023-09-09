public class S02Rectangle extends S02Shape {
	private double width;
	private double height;

	public S02Rectangle(String name, double width, double height) {
		super(name);
		this.width = width;
		this.height = height;
	}

	public S02Rectangle(double width, double height)
	{
		this("Rectangle", width, height);
	}

	public double getArea()
	{
		return width * height;
	}

	public double getHeight()
	{
		return height;
	}

	public double getWidth()
	{
		return width;
	}

	public String toString()
	{
		return "Rectangle with width: " + width + " and height: " + height;
	}
	public double getPerimeter() {
		return 2 * width + 2 * height;
	}
}
