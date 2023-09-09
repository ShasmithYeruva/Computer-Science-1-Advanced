/* TODO: 02A
Add an abstract method to the Shape class called
public abstract double getPerimeter()
Then implement this method on the different Shape subclasses.
 */
public abstract class S02Shape {
	private String name;

	public S02Shape(String name)
	{
		this.name = name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return this.name;
	}

	public abstract double getArea();
	public abstract double getPerimeter();
}
