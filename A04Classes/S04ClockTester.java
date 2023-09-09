

public class S04ClockTester {

	public static void main(String[] args) {
		/* Write your test code here */
		S03Clock c1 = new S03Clock(8,55,34);
		System.out.println(c1);
		System.out.println("Is this after 9 AM? " + c1.isLate());
		S03Clock c2 = new S03Clock(9,1,34);
		System.out.println(c2);
		System.out.println("Is this after 9 AM? " + c2.isLate());

	}

}
