package edu.ilstu;

public class TimeTester {

	public static void main(String[] args) {
		
		Time time1 = new Time(2, 30);
		System.out.println("Object for time1: " + time1);
		
		Time time2 = new Time(2, 45, "PM");
		System.out.println("Object for time2: " + time2);
		
		Time time3 = new Time(14, 45);
		System.out.println("Object for time3: " + time3);
		
		Time time4 = new Time(25, 50);
		System.out.println("Object for time4: " + time4);
		
		time3.setMinutes(68);
		
		System.out.println(time3.equals(time2));
		
		System.out.println(time3);
		
		System.out.println(time3.get12HourTime());

	}

}
