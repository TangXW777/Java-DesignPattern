package com.tang.adapter3;

/**
 * 适配器模式 Adapter
 * 三、接口的适配器
 * 在实际开发中，我们也常会遇到这种接口中定义了太多的方法，以致于有时我们在一些实现类中并不是都需要
 * @author TangXW
 *
 */
public class AdapterTest {
	
	public static void main(String[] args) {
		Sourceable s1 = new SourceSub1();
		Sourceable s2 = new SourceSub2();
		s1.method1();
		s1.method2();
		s2.method1();
		s2.method2();
	}
}
