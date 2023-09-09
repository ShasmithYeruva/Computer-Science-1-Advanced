/* TODO: 07A
This exercise presents a class called City that represents a City and 
saves its population. Extend this class so that it implements the 
S07Summable interface and add the two necessary methods.

Note: Adding the other summable interface does not change the population
of the city.
 */
public class S07City implements S07Summable{
    private int population;
    private String name;

    public S07City(String name, int population)
    {
        this.name = name;
        this.population = population;
    }
    
    public String getName()
    {
        return this.name;
    }

	public int add(S07Summable other) {
		return population + other.getValue();
	}

	public int getValue() {
		return population;
	}

}
