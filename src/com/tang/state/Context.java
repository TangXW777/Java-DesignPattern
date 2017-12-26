package com.tang.state;

/**
 * ×´Ì¬ÇÐ»»
 * @author TangXW
 *
 */
public class Context {

	private State state;
	
	public Context(State state){
		this.state = state;
	}
	
	public State getState(){
		return this.state;
	}
	
	public void setState(State state){
		this.state = state;
	}
	
	public void method(){
		String value = state.getValue();
		if("state1".equals(value)){
			state.method1();
		}else if("state2".equals(value)){
			state.method2();
		}
	}
}
