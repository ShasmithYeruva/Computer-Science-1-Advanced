public class S05Battery {
	private double voltage;
	/* TODO: 05B Add static variables here. */
	private static double totalVoltage_;
	private static int numOfBatteries_;
	public S05Battery(double voltage)
	{
		this.voltage = voltage;
		/* TODO: 05C Append to the constructor to keep track of totals. */
		numOfBatteries_ = numOfBatteries_ + 1;
		totalVoltage_ = totalVoltage_ + voltage;
	}

	public double getVoltage()
	{
		return this.voltage;
	}

	public static double getTotalVoltage() {
		//* TODO: 05D Replace 0.0 with the appropriate static variable.
		return totalVoltage_;
	}

	public static int getNumOfBatteries() {
		//* TODO: 05E Replace 0 with the appropriate static variable.
		return numOfBatteries_;
	}

}
