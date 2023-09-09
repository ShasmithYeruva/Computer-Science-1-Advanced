/* In this exercise, you should make two instances of the TextMessage class 
 * and print them out.  The following are just examples, deviate from the
 * messages below.
 * 
 * The first text is from Bart to Lisa and says “Where are you?” 
 * The second text message is from Lisa to Bart and says “I’m at school!”
 * 
 * Bart texted Lisa: Where are you?
 * Lisa texted Bart: I'm at school! */
public class Messages {

	public static void main(String[] args) {
		// TODO 14 Create the two TextMessage objects and print them out.
		TextMessage where = new TextMessage("Bart","Lisa","Where are you?");
		TextMessage school = new TextMessage("Lisa","Bart","I'm at school!");

		System.out.println(where);
		System.out.println(school);
	}

}
