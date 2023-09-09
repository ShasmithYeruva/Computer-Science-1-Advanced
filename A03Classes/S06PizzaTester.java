

public class S06PizzaTester {
	/* TODO: 06A
In the previous exercise we asked you to think about what instance 
variables a pizza should have. Now in this problem you should write 
up that class.

It must have a constructor with the method signature

S06Pizza(String theType, String theToppings, int theSize)
Also, write a toString for the class!

In your tester program you should create at least three different 
Pizza objects.
	 */
	public static void main(String[] args) {
		S06Pizza pizzaOne = new S06Pizza("thin", "peporoni", 7.99);
		S06Pizza pizzaTwo = new S06Pizza("stuffed", "bell peppers", 8.67);
		System.out.println(pizzaOne);
		System.out.println(pizzaTwo);
	}
}
