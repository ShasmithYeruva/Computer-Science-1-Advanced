

public abstract class S08Wow {
	//initializing the variables
	private int radius;
	public double price;
	private String name;
	// This is the constructor
	public S08Wow(int radius, double price, String name)
	{
		this.radius = radius;
		this.price = price;
		this.name = name;
	}
	//This prints out the different attributes
	public String toString()
	{
		return "The " + name + " has radius of\n" + radius + 
				".\n\nIt has a surface area of\n" + getArea() + 
				".\n\nIt has a volume of\n" + getVolume() +
				".\n\nIt has a Price of\n" + getPricePerSquareInch()
				+ " per square inch.\n" + 
				"\nIt also has a buoyancy of\n" + getBuoyancy() + ".\n\n\n";
	}
	//These are abstract methods that the child classes will inherit
	public abstract double getArea();
	public abstract double getPricePerSquareInch();
	public abstract double getBuoyancy();
	public abstract double getVolume();
}