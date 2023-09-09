/* TODO: 03A 
In this exercise, use the Student class to print out each 
student using a for-each loop with their first name, last 
name for a specified grade level.

Feel free to use the toString method in the Student class.

Note, the output has been rerouted to the file 
"S03ClassRosterOut.txt". To satisfy the code checker
make sure to include an output prompt and a colon space 
": " just before the output and a space after the output. 
Use the following as a guide.

Grade 9: 
Name: Julian Jones 
Name: Mikka Leads 
Grade: 10 
Name: Larisa Torres 
Name: Jay Khalil 

 */
public class S03ClassRoster {

	public static void main(String[] args) {
		S03Student julian = new S03Student("Julian", "Jones", 9);
		S03Student larisa = new S03Student("Larisa", "Torres", 10);
		S03Student amada = new S03Student("Amada", "Robin", 10);
		S03Student mikka = new S03Student("Mikka", "Leads", 9);
		S03Student jay = new S03Student("Jay", "Khalil", 10);

		S03Student[] classroom = {julian, larisa, amada, mikka, jay};

		TesterHelper th = new TesterHelper();
		th.initIO("S03ClassRosterOut.txt");

		printRoster(classroom, 9);
		printRoster(classroom, 10);

	}
	public static void printRoster(S03Student[] classroom, int gradeLevel) {
		// TODO: 03B Write enhanced for-each loop here.	
		System.out.println("Grade: " + gradeLevel);

		for(S03Student number: classroom) 
		{
			if(number.getGradeLevel() == gradeLevel) 
			{
				System.out.println(number);
			}
		}
	}

}
