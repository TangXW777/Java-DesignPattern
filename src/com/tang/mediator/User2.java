package com.tang.mediator;

public class User2 extends User {

	public User2(Mediator mediator){
		super(mediator);
	}
	
	@Override
	void work() {
		// TODO Auto-generated method stub
		System.out.println("user2 exe!");
	}
}
