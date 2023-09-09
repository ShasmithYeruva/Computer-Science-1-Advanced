

/* TODO: 02
Add a toString method to the S02Flower Class. Remember that the format for 
a toString method is:

public String toString()
The toString method should be formatted so that the following code

S02Flower foxglove = 
     new S02Flower("Foxglove", "Red", "Digitalis", "obscura");

System.out.println(foxglove);
Prints out

Red Foxglove (Digitalis obscura)
 */
public class S02Flower
{

	private String name;
	private String color;
	private String genus;
	private String species;

	public S02Flower(
			String theName, 
			String theColor, 
			String theGenus, 
			String theSpecies)
	{
		name = theName;
		color = theColor;
		genus = theGenus;
		species = theSpecies;
	}
	public String toString() {
		return color + " " + name + " (" + genus + " " + species + ")";
	}
}