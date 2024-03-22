package com.aasiln.override;

import java.util.*;

/**
 * 
 * @author lavanya 
 * Create a Pojo(Plain Old Java Object) Shape. Create a HashSet and store the unique Pojo in the application.
 *  Use Override methods to do this.
 * 
 */
class Angle {
	public String shapetype;

	// Constructor
	public Angle(String shapetype) {
		this.shapetype = shapetype;
	}

	public String getShapetype() {
		return shapetype;
	}

//this is overridden of equals
	@Override
	public boolean equals(Object o) {
		// Checking where the two Angle objects are equal based on their shape type or not
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Angle angle = (Angle) o;
		return Objects.equals(shapetype, angle.shapetype);
	}

	// this is overridden of hashcode

	@Override
	public int hashCode() {
		return Objects.hash(shapetype);
	}

}

public class Shape {

	public static void main(String[] args) {
		// Creating objects for class Shape
		Angle s1 = new Angle("triangle");
		Angle s2 = new Angle("Cube");
		Angle s3 = new Angle("Square");
		Angle s4 = new Angle("Cube"); // should not add this element
		Angle s5 = new Angle("rectangle");

		// Creating hash set to store shapes
		Set<Angle> shapes = new HashSet<>();
		// Adding elements to the hash set
		shapes.add(s1);
		shapes.add(s2);
		shapes.add(s3);
		shapes.add(s4);
		shapes.add(s5);

		// Printing the unique shapes
		for (Angle shape : shapes) {
			System.out.println(shape.getShapetype());
		}
	}
}
