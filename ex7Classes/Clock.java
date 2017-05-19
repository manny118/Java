package ex7Classes;

public class Clock {

	private int hours;
	private int seconds;
	private int minutes;

/*	/ * static int myHours; 
static int myMinutes; 
static int mySeconds;
	
	 */
	public Clock() {
	
	}

	public Clock(int hours, int minutes, int seconds) {

		setHours(hours);

		setMinutes(minutes);

		setSeconds(seconds);

	}

	public void setSeconds(int seconds) {

		if (seconds < 60) {

			this.seconds = seconds;
		} else {

			int countIncrease = 0;

			countIncrease = seconds / 60;

			this.seconds = seconds % 60;

			minutes += countIncrease;
			setMinutes(minutes);

		}

	}

	public void setMinutes(int minutes) {

		if (minutes < 60) {

			this.minutes = minutes;
		} else {
			int countIncrease = 0;

			countIncrease = minutes / 60;

			this.minutes = minutes % 60;
			hours += countIncrease;
		}

	}

	
	public void setHours(int hours) {
		// if(hours ==1){ }

		if (hours < 24) {
			this.hours = hours;
		}

		else {
	
			this.hours = hours % 24;

		}

	}

	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public int incrementHours(int addHours) {

		hours += addHours;

		setHours(hours);

		return hours;
	}

	public int incrementMinutes(int addMinutes) {

		minutes += addMinutes;

		setMinutes(minutes);

		return minutes;
	}

	public int incrementSeconds(int addSeconds) {

		seconds += addSeconds;

		setSeconds(seconds);

		return seconds;

	}

	public void reset() {

		hours = 0;
		minutes = 0;
		seconds = 0;

	}

	public String toString() {
		return String.format("%02d: %02d: %02d", hours, minutes, seconds);

	}

}
