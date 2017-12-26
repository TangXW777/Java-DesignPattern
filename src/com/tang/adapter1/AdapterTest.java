package com.tang.adapter1;

/**
 * 适配器模式 Adapter
 * 一、类的适配器
 * 核心思想就是：有一个Source类，拥有一个方法，待适配，
 * 目标接口时Targetable，通过Adapter类，将Source的功能扩展到Targetable里
 * @author TangXW
 *
 */
public class AdapterTest {
	
	public static void main(String[] args) {
		Targetable tt = new Adapter();
		tt.method1();
		tt.method2();
	}
}
