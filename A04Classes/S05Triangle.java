
public class S05Triangle {
	/* Write triangle code here */
	int widthIn;
	int heightIn;
	double x;
	public S05Triangle(int width, int height) {
		widthIn = width;
		heightIn = height;
	}
	public int getWidth() {
		return widthIn;
	}
	public int getHeight() {
		return heightIn;
	}
	public double getArea() {
		x = widthIn * heightIn;
		x = x/2;
		return x;
	}
	public String toString() {
		return ("This triangle has a width of " + widthIn+ 
				" and a height of " + heightIn  +
				" so the area of it is " + getArea());
	}
}
