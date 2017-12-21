package org.learning.designpattern.builder;

public abstract class Burger implements Item {


	public org.learning.designpattern.builder.Packing Packing() {
		return new Wrapper();
	}



}
