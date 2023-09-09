package s110;

/* In this program we are going to have you practice using the 
 * Point class. We’ve already created a Point object at (10, 5), 
 * printed it out, and moved it. First, try to run this program. 
 * Then, create your own Point at the position (2, 4) and 
 * print it out.*/
public class PointTester2 {

	public static void main(String[] args) {
		Point p = new Point(10, 5);
		System.out.println(p);
		p.move(3, 4);

		System.out.println(p);

		/* TODO 10 Make a new point here at position (2, 4) */    
		Point f = new Point(2, 4);
		/* TODO 11 Then print it out */
		System.out.println(f);
	}

}
