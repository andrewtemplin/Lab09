package edu.ilstu;

import java.util.Scanner;

public class CircleCheck {

	public static void main(String[] args) {
		
		Circle circ = new Circle();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter radius: ");
		circ.setRadius(scan.nextDouble());
		
		
		System.out.println("The area is: " + circ.getArea());
		System.out.println("The diameter is: " + circ.getDiameter());
		System.out.println("The circumference is: " + circ.getCircumference());
			
			 
	}

}
