

public class S07DistanceTester {
	public static double SAN_FRANCISCO_LONGITUDE = 122.4167;
	public static double SAN_FRANCISCO_LATITUDE = 37.7833;
	public static double NEW_YORK_LONGITUDE = 74.0059;
	public static double NEW_YORK_LATITUDE = 40.7127;

	/**
	 * This program computes the distance in miles between 
	 * San Francisco, California and New York City, New York 
	 * using the GeoLocation class.
	 * 
	 */

	public static void main(String[] args) {
		S07GeoLocation sf = new S07GeoLocation(
				SAN_FRANCISCO_LATITUDE, 
				SAN_FRANCISCO_LONGITUDE);

		S07GeoLocation nyc = new S07GeoLocation(
				NEW_YORK_LATITUDE, 
				NEW_YORK_LONGITUDE);

		double distance = sf.distanceFromInKilometers(nyc);

		System.out.println("The distance from San Francisco to New York is " 
				+ distance + " kilometers");

	}
}
