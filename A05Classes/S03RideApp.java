public class S03RideApp {
	private String passenger_;
	private String fromLocation_;
	private String toLocation_;

	public S03RideApp(
			String passenger, 
			String fromLocation, 
			String toLocation) {
		passenger_ = passenger;
		fromLocation_ = fromLocation;
		toLocation_ = toLocation;
	}

	/* TODO: 3B
	 * Add new get methods here.
	 */
	public String getPassenger() {
		return passenger_;
	}
	public String getFromLocation() {
		return fromLocation_;
	}
	public String getToLocation() {
		return toLocation_;
	}
	public String toString() {
		return passenger_ + " is requesting to from " 
				+ fromLocation_ + " to " + toLocation_;
	}
}
