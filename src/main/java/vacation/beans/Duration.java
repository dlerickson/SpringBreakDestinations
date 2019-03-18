package vacation.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Duration {

	private int traveldays;
	private int totaldays;

	// default no args
	public Duration() {
		super();
	}

	// if we could only stay longer...
	public Duration(int travelDays, int totalDays) {
		super();
		this.traveldays = travelDays;
		this.totaldays = totalDays;
	}

	public int getTravelDays() {
		return traveldays;
	}

	public void setTravelDays(int travelDays) {
		this.traveldays = travelDays;
	}

	public int getTotalDays() {
		return totaldays;
	}

	public void setTotalDays(int totalDays) {
		this.totaldays = totalDays;
	}

	@Override
	public String toString() {
		return "Duration [travelDays=" + traveldays + ", totalDays=" + totaldays + "]";
	}

}
