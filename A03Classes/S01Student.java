

public class S01Student
{
	private String firstName;
	private String lastName;
	private int gradeLevel;

	/**
	 * This is a constructor.  A constructor is a method
	 * that creates an object -- it creates an instance
	 * of the class. What that means is it takes the input
	 * parameters and sets the instance variables (or fields)
	 * to the proper values.
	 * 
	 * Check out S01StudentTester.java for an example of how to use
	 * this constructor. 
	 */
	public S01Student(String fName, String lName, int grade)
	{
		firstName = fName;
		lastName = lName;
		gradeLevel = grade;
	}

	public String toString()
	{
		return firstName + " " + lastName 
				+ " is in grade: " + gradeLevel;
	}
}