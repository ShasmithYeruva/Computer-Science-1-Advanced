public class S08WowTester {
	/*
	 *  S08WowTester Class
	 *  The Wow code is designed to challenge those students that have 
	 *  already completed the assignment and offer a freelance learning 
	 *  experience.
	 *  
	 *  Wow code cannot not be embedded inside an assignment class.  
	 *  
	 *  The Wow code cannot have input prompts. If you require inputs, 
	 *  use the randomizer class utility or use a text file input.
	 *  
	 *  The Wow code must be related to the assignment in order to 
	 *  receive maximum points.
	 *  
	 *  Points awarded for the Wow code only for the first deadline
	 *  submission or whenever Mr. Pla grades the first submission,
	 *  whichever comes last.
	 *  
	 *  Three sets of documentation required, 
	 *  (1) An overall description on what you are attempting to accomplish
	 *  (2) A description of each method stating its functional purpose.
	 *  (3) The output should be message based, not just raw numbers.
	 *  
	 *  The test code must be placed in the S08WowTester.java file.  If you 
	 *  decide to add unique files as part of this exercise, include those 
	 *  files in the archive by adding a zc.addEntry("<filename.ext>"); 
	 *  line to the Tester.java main method for each new file.
	 *     
	 *  Points awarded for meeting the above criteria.
	 */
	public static void main(String[] args) {
		/* This takes the price, radius, and name in order to later get the 
		* surface area, volume, price per square inch, and buoyancy and then
		* prints everything out with the use of a toString
		*/
		S08Wow a = new S08WowBasketball(15, 15.99, "basketball");
		S08Wow b = new S08WowVolleyball(21, 12.87, "volleyball");
		S08Wow c = new S08WowBaseball(7, 4.96, "baseball");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
