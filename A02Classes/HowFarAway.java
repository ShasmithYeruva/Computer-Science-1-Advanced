
/* In this exercise you will write a program to compute the distance between 
 * any two geo locations.

In this program you will ask the user for four numbers.

starting latitude
starting longitude
ending latitude
ending longitude
Then, using the GeoLocation class and our earlier example as a reference, 
compute the distance in miles between the two locations.

A sample program run should match exactly as below:

Enter the latitude of the starting location: 48.8567
Enter the longitude of the starting location: 2.3508
Enter the latitude of the ending location: 51.5072
Enter the longitude of the ending location: 0.1275
The distance is 208.08639358288565 miles.
 */
public class HowFarAway {

	public static double startingLat = 48.8567;
	public static double startingLong = 2.3508;
	public static double endLat = 51.5072;
	public static double endLong = 0.1275;
	public static void main(String[] args) {
		GeoLocation start = new GeoLocation(startingLat, startingLong);
		GeoLocation end = new GeoLocation(endLat,endLong);

		double distance = start.distanceFrom(end);
		System.out.println("The distance from the starting location to the end is " + distance + " miles");
	}
}
