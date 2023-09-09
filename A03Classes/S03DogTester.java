
/* TODO: 03B
Read overview
Now we are going to use more instance variables. Here we have a class that 
represents a dog. Currently, the only instance variable (or field) is called 
breed. You can make a new Dog object by passing the breed to the constructor.

We want to add an instance variable that is a String called name, which 
represents the dog’s name. Add the instance variable and also include it 
as the second parameter to the constructor.

You should update the toString and the format should be: “[name] is a [breed]”
For example:

Sammy is a Golden Retriever
Maggie is a Chihuahua
Test out your Dog class and the new toString method in S03DogTester.java
 */
public class S03DogTester {

	public static void main(String[] args) {
		S03Dog golden = new S03Dog("Golden Retriever", "Sammy");
		System.out.println(golden);
	}

}
