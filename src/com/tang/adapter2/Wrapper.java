package com.tang.adapter2;

public class Wrapper implements Targetable{

	private Source source; // ��1��������ǲ��ټ̳У�����ӵ�����䷽�����ʵ��
	
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
