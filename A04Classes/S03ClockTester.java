

public class S03ClockTester {
	public static void main(String[] args) {
		/* Write tester code here */
		S03Clock c1 = new S03Clock(8,55,34);
		S03Clock c2 = new S03Clock(9,1,34);
		System.out.println(c1);
		System.out.println("The total amount of seconds is: " + c1.getTotalSeconds());
		System.out.println(c2);
		System.out.println("The total amount of seconds is: " + c2.getTotalSeconds());
	}

}
