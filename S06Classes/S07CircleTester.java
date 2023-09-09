/* TODO 07A 
This program is incorrectly comparing Circles using ==.

Modify the S07CircleTester class to correctly compare Circle objects 
using .equals

You’ll need to implement the following methods in the Circle class so 
that the S07CircleTester can correctly compare and print Circles:

public String toString()
public boolean equals(Circle other)
equals should only return true if both Circles have the exact same 
attributes (color, radius, x, and y).
 */
public class S07CircleTester {

	public static void main(String[] args) {
		S07Circle one = new S07Circle(10, "blue", 50, 35);
		S07Circle two = new S07Circle(10, "blue", 50, 35);
		S07Circle three = new S07Circle(20, "red", 0, 0);
		S07Circle four = three;
		S07Circle five = new S07Circle(10, "blue", 50, 40);

		// TODO: 07B
		// Modify this program to correctly compare objects
		// We should not be comparing objects using ==

		if(one.equals(two))
		{
			System.out.println("Circles one and two are equal!");
			System.out.println(one);
			System.out.println(two);
		}

		if (!one.equals(three)) 
		{
			System.out.println("Circles one and three are not equal!");
			System.out.println(one);
			System.out.println(three);
		}

		if(!one.equals(five))
		{
			System.out.println("Circles one and five are not equal!");
			System.out.println(one);
			System.out.println(five);
		}

		if(three.equals(four))
		{
			System.out.println("Circles three and four are equal!");
			System.out.println(three);
			System.out.println(four);
		}
	}
}
