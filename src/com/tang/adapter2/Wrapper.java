package com.tang.adapter2;

public class Wrapper implements Targetable{

	private Source source; // 和1的区别就是不再继承，而是拥有适配方法类的实例
	
	public Wrapper(Source source){
		this.source = source;
	}
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		source.method1();
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is wrapper method2");
	}
	
}
