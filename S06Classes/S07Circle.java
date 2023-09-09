
public class S07Circle {
	private int radius;
	private String color;
	private int x;
	private int y;

	public S07Circle(int theRadius, String theColor, 
			int xPosition, int yPosition)
	{
		radius = theRadius;
		color = theColor;
		x = xPosition;
		y = yPosition;
	}

	public int getRadius()
	{
		return radius;
	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

	public String getColor()
	{
		return color;
	}

	public String toString()
	{
		return color + " circle with a radius of " 
				+ radius + " at position (" + x + ", " + y + ")";
	}

	// TODO: 07C Implement an equals method here!
	public boolean equals(S07Circle other)
	{
		// Change this!
		if(radius == other.radius && color == other.color && x == other.x && y == other.y) {
			return true;
		}
		else {
			return false;
		}

	}

}
