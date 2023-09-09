/* TODO: 06A
PART 1 of 2
Run the code to see the null pointer exception occur.

PART 2 of 2
Your job in this exercise is write down some of the differences between 
objects and primitives.

Write down your answers to these questions just below each question.

If you need a refresher on the differences between objects and primitives, 
watch the Objects vs Primitives video in CodeHS.

TODO: 06B
What is an object, and what is a primitive? 
Objects are custom types made using a class while a primitive is a default type integrated in java and can not be further divided.
TODO: 06C
How are they stored differently?
Objects are stored by address while primitives are stored as just the value.
TODO: 06D
How do we compare objects to each other? 
You can compare objects by using .equals to see if the two objects are the same.
TODO: 06E
How do we compare primitives to each other? 
You can compare primitives by using the "==", "=<", "=>", ">", and "<" operators.

 */
public class S06NullPointerTester {

	public static void main(String[] args) {
		S06Person realS06Person = null;
		S06Person ghost = null;

		// Initialize realS06Person
		realS06Person = new S06Person("Mike", 45);

		// If we don't define a toString method
		// the actual memory address is printed.
		System.out.println(realS06Person);

		// Initialize to a new S06Person, get a new memory address
		realS06Person = new S06Person("Michael", 45);
		System.out.println(realS06Person);

		// ghost is never initialized, so there is no
		// memory address to point to.
		// Instead, the value held in the variable is null
		System.out.println(ghost);

		// Calling a method on an object that is null
		// results in a NullPointerException!
		String name = ghost.getName();		
	}
}
