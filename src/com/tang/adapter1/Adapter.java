package com.tang.adapter1;

/**
 * 适配器，将Sourece的实现适配到targetable中
 * @author TangXW
 *
 */
public class Adapter extends Source implements Targetable{

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is adapter method2");
	}
	
}
