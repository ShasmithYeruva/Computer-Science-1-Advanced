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


		/*  This code is getting the square's side length and
		 * circle's radius and finding the area of both. Then it compares
		 *  the two areas to see if the circle can fit in the square.
		 */


		// Objects are created
		S08Wow one = new S08Wow(64,11.5);
		S08Wow two = new S08Wow(84,12.3);
		S08Wow three = new S08Wow(92.5,10);
		S08Wow four = new S08Wow(64.1,9);
		S08Wow five = new S08Wow(35.2,8);
		S08Wow six = new S08Wow(32,12);
		S08Wow seven = new S08Wow(40,22);
		S08Wow eight = new S08Wow(46.3,15.4);
		S08Wow nine = new S08Wow(37.4,2.6);
		S08Wow ten = new S08Wow(40.1,10.6);	
		
		
		// Array with all objects
		S08Wow[] ShapeList = {one, two, three, four, five, six, 
				seven, eight, nine, ten};
		int shapeSelector = Randomizer.nextInt(ShapeList.length-1);

		// This next line of code randomly picks out a square and circle and prints it
		System.out.println(ShapeList[shapeSelector]);
	}

}




