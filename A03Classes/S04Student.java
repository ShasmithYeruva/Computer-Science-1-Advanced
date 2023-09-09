
/* TODO: 04 
This program starts with the S04Student class from earlier. We want to 
add a new instance variable (or field) that represents the student’s 
GPA. Since it can contain a decimal place, you’ll need to figure out 
the right type.

You should also add the GPA to the toString method and use it to 
print out the following:

Alan Turing is in grade: 11 and has GPA: 3.5
Ada Lovelace is in grade: 12 and has GPA: 3.8
 */
public class S04Student {
	private String firstName;
	private String lastName;
	private int gradeLevel;
	// Add your instance variable here.
	private double totalGPA;
	/**
	 * This is a constructor.  A constructor is a method
	 * that creates an object -- it creates an instance
	 * of the class. What that means is it takes the input
	 * parameters and sets the instance variables (or fields)
	 * to the proper values.
	 * 
	 * Check out StudentTester.java for an example of how to use
	 * this constructor. 
	 */
	public S04Student(String fName, String lName, int grade, double GPA)
	{
		firstName = fName;
		lastName = lName;
		gradeLevel = grade;
		totalGPA = GPA;
	}

	/**
	 * This is a toString for the Student class. It returns a String
	 * representation of the object, which includes the fields
	 * in that object.
	 */
	public String toString()
	{
		return firstName + " " + lastName + " is in grade: " + gradeLevel + " and has GPA: " + totalGPA;
	}

}
