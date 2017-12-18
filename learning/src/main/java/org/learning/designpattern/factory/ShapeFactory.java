package org.learning.designpattern.factory;

public class ShapeFactory {
	
	   //use getShape method to get object of type shape 
	   public static Shape getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }		
	      if(shapeType.equalsIgnoreCase(Shape.Circle)){
	         return new Circle();
	         
	      } else if(shapeType.equalsIgnoreCase(Shape.Rectangle)){
	         return new Rectangle();
	         
	      } else if(shapeType.equalsIgnoreCase(Shape.Square)){
	         return new Square();
	      }
	      
	      return null;
	   }
	}