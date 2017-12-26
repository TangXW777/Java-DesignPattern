package com.tang.mediator;

public abstract class User {
	private Mediator mediator;
	
	public User(Mediator mediator){
		this.mediator = mediator;
	}
	
	abstract void work();
}
