 
public class RectangleTester1 {
	public static void main(String[] args) {
		// Create a new rectangle with a width of 10 and a height of 3
		Rectangle rect = new Rectangle(10, 3);

		// Print out information about the rectangle
		System.out.println(rect);

		// Print out the area of the rectangle
		System.out.println("The area of the rectangle is " + rect.getArea());

		// Print out the height of the rectangle
		System.out.println("The height of the rectangle is " + rect.getHeight());
	}
}