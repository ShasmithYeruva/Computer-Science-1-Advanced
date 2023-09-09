
/* In this program we have a Student class in Student.java 
 * and a tester program at StudentTester.java. If you open 
 * up StudentTester.java you will see we have a bit of code
 *  there already. We’ve created two new students, Alan and Ada.
 *  We create a Student instance by calling the constructor and 
 *  passing in the first name, last name, and grade level as an integer. */

/* TODO 12 Your task is to create a Student with your information! 
 * Once you have created the student, print it out to the console. */

public class StudentTester2 {

	public static void main(String[] args) {
		Student alan = new Student("Alan", "Turing", 11);
		Student ada = new Student("Ada", "Lovelace", 12);
		Student shasmith = new Student ("Shasmith", "Yeruva", 10);
		System.out.println(alan);
		System.out.println(ada);
		System.out.println(shasmith);
	}

}
