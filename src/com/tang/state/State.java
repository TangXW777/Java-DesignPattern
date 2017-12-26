package com.tang.state;

public class State {
	private String value;
	
	public void setValue(String value){
		this.value = value;
	}
	
	public String getValue(){
		return this.value;
	}
	
	public void method1(){
		System.out.println("this is method1");
	}
	
	public void method2(){
		System.out.println("this is method2");
	}
	
}
