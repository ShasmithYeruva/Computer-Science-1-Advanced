

public class S08WowTester {
	/*
	 *  S08WowTester Class
	 *  The Wow class is designed to challenge those students that have 
	 *  already completed the assignment and offer a freelance learning 
	 *  experience.
	 *  
	 *  Wow code cannot not be embedded inside an assignment class.  
	 *  It must be a separate class called S08WOW.
	 *  
	 *  The Wow class is only counted if you turned in your assignment 
	 *  on time AND received a perfect score on the rest of your 
	 *  assignment.
	 *  
	 *  The Wow class cannot have input prompts. If you require inputs, 
	 *  use the randomizer class utility.
	 *  
	 *  Three sets of documentation required, 
	 *  (1) An overall description on what you are attempting to accomplish
	 *  (2) A description of each method stating its functional purpose.
	 *  (3) The output should be message based, not just raw numbers.
	 *  
	 *  Points awarded for originality and creativity.
	 */
	public static void main(String[] args) {

		/* This finds what all the side and angles equal in a
		 *  right triangle with just two 
		 * angles and one side.
		 */

		//Creating the triangle 1 object
		S08Wow t1 = new S08Wow(25, 49, 67);
		//Printing out the triangle 1 object
		System.out.println(t1);
		//Creating the triangle 2 object
		S08Wow t2 = new S08Wow(11 ,23, 79);
		//Printing out the triangle 2 object
		System.out.println(t2);
		//Creating the triangle 3 object
		S08Wow t3 = new S08Wow(12, 56, 89);
		//Printing out the triangle 3 object
		System.out.println(t3);


	}
}
