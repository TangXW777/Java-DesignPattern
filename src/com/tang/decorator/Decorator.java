package com.tang.decorator;

/**
 * ×°ÊÎÆ÷
 * @author TangXW
 *
 */
public class Decorator implements Sourceable{

	private Source source;
	
	public Decorator(Source source){
		this.source = source;
	}
	
	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("before source...");
		source.method();
		System.out.println("after source...");
	}
	
}
