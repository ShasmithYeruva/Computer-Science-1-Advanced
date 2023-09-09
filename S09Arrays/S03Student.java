
public class S03Student {
	// Attributes
	private String firstName;
	private String lastName;
	private int gradeLevel;

	// Constructor
	public S03Student(String fName, String lName, int grade)
	{
		firstName = fName;
		lastName = lName;
		gradeLevel = grade;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;   
	}

	public int getGradeLevel()
	{
		return gradeLevel;
	}

	public String toString() 
	{
		return ("Name: " + getFirstName() + " " + getLastName());
	}
}