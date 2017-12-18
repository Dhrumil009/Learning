package org.learning.designpattern.factory;

public class FactoryPatternDemo {
	public static void main(String... st) {
	    //get an object of Circle and call its draw method.
	    Shape shape1 = ShapeFactory.getShape(Shape.Circle);

	    //call draw method of Circle
	    shape1.draw();

	    //get an object of Rectangle and call its draw method.
	    Shape shape2 = ShapeFactory.getShape(Shape.Rectangle);

	    //call draw method of Rectangle
	    shape2.draw();

	    //get an object of Square and call its draw method.
	    Shape shape3 = ShapeFactory.getShape(Shape.Square);

	    //call draw method of circle
	    shape3.draw();
	}
}
