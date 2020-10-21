package edu.ilstu;

public class Time {

	private int hours;
	private int minutes;
	private String amPm;
	
	
	public Time()
	{
		this.hours = 0;
		this.minutes = 0;
	}
	public Time(int hours, int minutes)
	{
		if ( hours >= 0 && hours <= 23 && minutes >= 0 && minutes <= 59) {
			this.hours = hours;
			this.minutes = minutes;
		}
		else {
			this.hours = 0;
			this.minutes= 0;
		}
	}
	public Time(int hours, int minutes, String amPm)
	{
		
		if ( hours >= 0 && hours <= 12 && minutes >= 0 && minutes <= 59) {
			this.hours = hours;
			this.minutes = minutes;
		}
		else {
			this.hours = 0;
			this.minutes= 0;
		}
		
		if (amPm.toUpperCase() == "PM" && hours < 12) {
			this.hours = hours + 12;
		} else if (amPm.toUpperCase() == "AM" && hours == 12 ) {
			this.hours = hours - 12;
		}
	}
	
	public void setMinutes(int minutes) {
		if (minutes >= 0 && minutes <= 59) {
			this.minutes = minutes;
		}
	}
	
	public int getMinutes() {
		return this.minutes;
	}
	
	public void setHours(int hours) {
		if (hours >= 0 && hours <= 23) {
			this.hours = hours;
		}
	}
	
	public int getHours() {
		return this.hours;
	}
	
	public String toString()
	{
		return this.hours + ":" + this.minutes;
	}
	
	public boolean equals (Time obj)
	{
		if (this.hours == obj.hours && this.minutes == obj.minutes)
			return true;
		else
			return false;
	}
	
	public String get12HourTime() {
		String amPM = "AM";
		if (hours > 12) {
			this.hours = hours - 12;
			amPM = "PM";
		}
		return toString() + amPM;
	}
	
}
