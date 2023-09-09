

public class S05TriangleTester {
	/* TODO: 05 Write a class called Triangle. A Triangle should have 
	 * a height and width like Rectangle and needs getter methods for 
	 * both.
	 * 
	 * Triangle will also need a constructor method and a method to 
	 * calculate area.
	 * The constructor should take the width as the first argument 
	 * and the height as the second argument.
	 * 
	 * You should create three methods called getWidth(), getHeight(), 
	 * and getArea(). The getWidth and getHeight methods should return
	 * the values of the instance variables and the getArea() should
	 * calculate and return the area of the triangle.
	 * 
	 * Remember the area of a triangle can be calculated 
	 * using 1/2 * width * height.
	 * 
	 * Note: The height and width variables should be ints and getArea 
	 * should return a double.
	 * 
	 * Output a message about the width, height, and area of 
	 * the triangle, not just the numbers.
	 */
	public static void main(String[] args) {
		/* Write your test code here */
		S05Triangle one = new S05Triangle (10 ,15); 
		S05Triangle two = new S05Triangle (14 ,21); 
		S05Triangle three = new S05Triangle (9 ,19); 
		S05Triangle four = new S05Triangle (11 ,17); 
		S05Triangle five = new S05Triangle (25 ,40); 
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
	}

}
