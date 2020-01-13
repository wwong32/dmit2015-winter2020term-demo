package ca.nait.dmit.domain;

/**
 * The Circle class models a circle shape.
 * 
 * @author Sam Wu
 * @version 2018.01.18
 */
public class Circle {
	
	/** The radius of the circle */
	private double radius;	
	
	/** Return the radius of the circle */
	public double getRadius() {
		return radius;
	}
	
	/**
	 * Change the radius of the circle
	 * @param radius The new radius of the circle
	 */
	public void setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;			
		} else {
			throw new RuntimeException("Radius value must be > 0");
		}
	}	

	
	/** Construct a circle with a specified radius */
	public Circle(double newRadius) {
		radius = newRadius;
	}

	/** Construct a circle object with a radius 1 */
	public Circle() {
		radius = 1;
	}

	/**
	 * Returns the area of the circle using the formula: 
	 * 	area = PI * radius * radius
	 * 
	 * @return The calculated area of the circle
	 */
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	/**
	 * Returns the diameter of the circle using the formula: 
	 * 	diameter = radius * 2
	 * 
	 * @return The calculated diameter of the circle
	 */
	public double getDiameter() {
		return radius * 2;
	}

	/**
	 * Returns the circumference of the circle using the formula: 
	 * 	circumference = 2 * PI * radius
	 * 
	 * @return The calculated circumference of the circle
	 */
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
}