
/* TODO: 03A
Now we are going to use more instance variables. Here we have a class 
that represents a dog. Currently, the only instance variable 
(or field) is called breed. You can make a new Dog object by passing 
the breed to the constructor.

We want to add an instance variable that is a String called name, 
which represents the dog’s name. Add the instance variable and also 
include it as the second parameter to the constructor.

You should update the toString and the format 
should be: “[name] is a [breed]”

For example:

Sammy is a Golden Retriever
Maggie is a Chihuahua

Test out your Dog class and the new toString method in DogTester.java


 */
public class S03Dog {
	private String breed;
	// Add an instance variable here for name.
	private String name;
	public S03Dog(String theBreed)
	{
		breed = theBreed;
	}

	public S03Dog(String breed_, String name_) {
		/* TODO: 03C
		 * string and string2 are poor names for this constructor
		 * rename those to something more representative of its'
		 * function. 
		 */
		name = name_;
		breed = breed_;
	}

	public String toString()
	{
		return name + " is a " + breed;
	}

}
