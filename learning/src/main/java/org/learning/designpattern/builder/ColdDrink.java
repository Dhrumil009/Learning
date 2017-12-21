package org.learning.designpattern.builder;

public abstract class ColdDrink implements Item {

	public org.learning.designpattern.builder.Packing Packing() {
	       return new Bottle();
		}

}