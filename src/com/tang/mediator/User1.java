package com.tang.mediator;

public class User1 extends User {
	
	public User1(Mediator mediator){
		super(mediator);
	}
	
	@Override
	void work() {
		// TODO Auto-generated method stub
		System.out.println("user1 exe!");
	}

}
