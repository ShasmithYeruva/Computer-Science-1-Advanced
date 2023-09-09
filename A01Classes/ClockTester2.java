/*
 * In this program, we are going to practice calling methods on different
 * objects.
 * There are two files Clock.java and ClockTester2.java.
 * In ClockTest2.java you should
 * Create a Create a clock with hour = 3 and seconds = 32.
 * Print out the hour
 * Print out the seconds.
 * Print out the total minutes by calling the getTotalMinutes method.
 */
public class ClockTester2 {
	public static void main(String[] args) {
		// TODO 06 Create a clock with hour = 3 and minutes = 32
		Clock clock = new Clock(3, 32);
		/* TODO 07 Print out the hour */
		System.out.println(clock.getHours());
		/* TODO 08 Print out the minutes. */
		System.out.println(clock.getMinutes());
		/* TODO 09 Print out the total minutes by calling the 
		 *          getTotalMinutes method.
		 */
		System.out.println(clock.getTotalMinutes());
	}

}
