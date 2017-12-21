package org.learning.designpattern.decorator;

public abstract class AbstractDesign implements Shape {

	   protected Shape decoratedShape;

	   public AbstractDesign(Shape decoratedShape){
	      this.decoratedShape = decoratedShape;
	   }

	   public void draw(){
	      decoratedShape.draw();
	   }	
	
	
}
