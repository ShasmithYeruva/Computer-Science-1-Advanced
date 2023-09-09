package s110;

public class Clock {

	private int hours_;
	private int minutes_;

	public Clock(int hours, int minutes)
	{
		hours_ = hours;
		minutes_ = minutes;
	}

	public int getTotalMinutes()
	{
		return hours_ * 60 + minutes_;
	}

	public int getHours()
	{
		return hours_;
	}

	public int getMinutes()
	{
		return minutes_;
	}


	public String toString()
	{
		return "Clock hours " + hours_ + " and minutes " + minutes_;
	}
}