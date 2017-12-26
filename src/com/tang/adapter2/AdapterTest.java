package com.tang.adapter2;

/**
 * 适配器模式 Adapter
 * 二、对象的适配器
 * 基本思路和类的适配器模式相同，只是将Adapter类作修改，
 * 这次不继承Source类，而是持有Source类的实例，以达到解决兼容性的问题
 * @author TangXW
 *
 */
public class AdapterTest {
	
	public static void main(String[] args) {
		Targetable tt = new Wrapper(new Source());
		tt.method1();
		tt.method2();
	}
}
