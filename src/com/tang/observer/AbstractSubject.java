package com.tang.observer;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject {

	Vector<Observer> observers = new Vector<Observer>();
	
	@Override
	public void add(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void remove(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		Enumeration<Observer> aEnum = observers.elements();
		while(aEnum.hasMoreElements()){
			Observer o = aEnum.nextElement();
			o.update();
		}
	}


}
