
public class S06Pizza {
	/* TODO: 06B
	Write your class here.
	 */
	private String crustType;
	private String topping;
	private double price;
	public S06Pizza(String crust_, String topping_, double price_)
	{
		crustType = crust_;
		topping = topping_;
		price = price_;
	}
	public String toString()
	{
		return "This pizza has a " + crustType + " crust and it has the topping of " + topping + " so the price will be $" + price;
	}
}
