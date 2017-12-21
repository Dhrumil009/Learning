package org.learning.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private List<Observer> objList = new ArrayList<Observer>();
	private int state;

	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
		notifyToAll();
	}

	public void attach(Observer observer) {
		objList.add(observer);
	}

	public void notifyToAll() {
		for (Observer ob : objList) {
			ob.update();
		}
	}

}
