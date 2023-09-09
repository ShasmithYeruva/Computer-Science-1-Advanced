
public class S07GeoLocation {
	// Earth radius in miles
	public static final double RADIUS = 3963.1676;  

	// Number of kilometers in one mile
	public static final double KM_PER_MILE = 1.60934;

	private double latitude;
	private double longitude;

	/**
	 * Constructs a geo location object with given latitude and longitude
	 */
	public S07GeoLocation(double theLatitude, double theLongitude) 
	{
		latitude = theLatitude;
		longitude = theLongitude;
	}

	/**
	 * Returns the latitude of this geo location
	 */
	public double getLatitude() 
	{
		return latitude;
	}

	/**
	 * returns the longitude of this geo location
	 */
	public double getLongitude() 
	{
		return longitude;
	}

	// returns a string representation of this geo location
	public String toString() 
	{
		return "latitude: " + latitude + ", longitude: " + longitude;
	}

	public double distanceFromInKilometers(S07GeoLocation other)
	{
		double lat1 = Math.toRadians(latitude);
		double long1 = Math.toRadians(longitude);
		double lat2 = Math.toRadians(other.latitude);
		double long2 = Math.toRadians(other.longitude);
		// apply the spherical law of cosines with a triangle composed of the
		// two locations and the north pole
		double theCos = Math.sin(lat1) * Math.sin(lat2) +
				Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2);
		double arcLength = Math.acos(theCos);
		double x = arcLength * RADIUS;
		return x * KM_PER_MILE;
	}

	// returns the distance in miles between this geo location and the given
	// other geo location
	public double distanceFrom(S07GeoLocation other) 
	{
		double lat1 = Math.toRadians(latitude);
		double long1 = Math.toRadians(longitude);
		double lat2 = Math.toRadians(other.latitude);
		double long2 = Math.toRadians(other.longitude);
		// apply the spherical law of cosines with a triangle composed of the
		// two locations and the north pole
		double theCos = Math.sin(lat1) * Math.sin(lat2) +
				Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2);
		double arcLength = Math.acos(theCos);
		return arcLength * RADIUS;
	}

}
