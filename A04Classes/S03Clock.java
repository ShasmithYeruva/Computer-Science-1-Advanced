
public class S03Clock {
	private final static int IS_9AM = 9;
	private int hours_;
	private int minutes_;
	private int seconds_;

	public S03Clock(int hours, int minutes, int seconds) {
		hours_ = hours;
		minutes_ = minutes;
		seconds_ = seconds;
	}

	public int getHours() {
		return hours_;
	}

	public int getMinutes() {
		return minutes_;
	}

	public int getSeconds() {
		return seconds_;
	}

	public int getTotalSeconds() {
		/* Exercise 03 modify method 
		 * called getTotalSeconds here */
		return hours_ * 60 * 60 + minutes_ * 60 + seconds_;
	}

	public boolean isLate() {
		/* Exercise 04 modify method 
		 * called isLate here */
		if (hours_ > IS_9AM) {
			return true;
		}
		else if(hours_ == IS_9AM && minutes_ > 0) {
			return true;
		}
		else if(hours_ == IS_9AM && seconds_ > 0) {
			return true;
		}
		else if(hours_ == IS_9AM && minutes_ == 0 &&  seconds_ == 0) {
			return false;
		}
		else {
			return false;
		}
	}

	public String toString() {
		return "Time: "+ pad(hours_) +":" 
				+ pad(minutes_) + ":" + pad(seconds_);
	}

	private String pad(int number) {
		return String.format("%02d", number);
	}
}
