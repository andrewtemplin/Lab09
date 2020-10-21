package edu.ilstu;

public class Circle {

		private final double PI = 3.14159;
		private double radius;
		private double area;
		private double diameter;
		private double circumference = 2 * PI * radius;
		
		public Circle() 
		{
			
		}
		public double getRadius() {
			return radius;
		}
		public void setRadius(double newRadius) {
			radius = newRadius;
		}
		
		public double getArea() {
			return area = (radius * radius) * PI;
		}
		public void setArea(double newArea) {
			area = newArea;
		}
		public double getDiameter() {
			return diameter = radius * 2;
		}
		public void setDiameter(double newDiameter) {
			diameter = newDiameter;
		}
		public double getCircumference() {
			return circumference = 2 * PI * radius;
		}
		public void setCircumference(double newCircumference) {
			circumference = newCircumference;
		}
	}


