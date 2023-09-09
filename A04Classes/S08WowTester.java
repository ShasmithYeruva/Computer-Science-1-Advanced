

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


		/*  This code is getting the pizza's and pepperoni's radius and 
		 *  finding the circumference and area of both. 
		 *  After than it then multiplies the number of pepperoni to its area
		 *   to see the total area and compares it to the pizza's
		 * area to see if the pepperoni can fit.
		 */


		// Objects are created
		S08Wow one = new S08Wow(64.2,11.5,8);
		S08Wow two = new S08Wow(84.3,12.4,7);
		S08Wow three = new S08Wow(92.5,10.3,6);
		S08Wow four = new S08Wow(64.1,9.2,5);
		S08Wow five = new S08Wow(35.2,8.1,5);
		S08Wow six = new S08Wow(32.4,12.7,9);
		S08Wow seven = new S08Wow(40.2,22.6,8);
		S08Wow eight = new S08Wow(46.3,15.5,18);
		S08Wow nine = new S08Wow(37.2,17.6,6);
		S08Wow ten = new S08Wow(40.1,10.9,5);

		// Array with all objects
		S08Wow[] PizzaList = {one, two, three, four, five, six, 
				seven, eight, nine, ten};
		int pizzaSelector = Randomizer.nextInt(PizzaList.length-1);

		// This next line of code randomly picks out a Pizza and prints it
		System.out.println(PizzaList[pizzaSelector]);
	}
}
