package com.tang.bridge;

/**
 * 桥接模式 Bridge
 * 桥接模式就是把事物和其具体实现分开，使他们可以各自独立的变化。
 * 桥接的用意是：将抽象化与实现化解耦，使得二者可以独立变化，像我们常用的JDBC桥DriverManager一样
 * @author TangXW
 *
 */
public class BridgeTest {
	public static void main(String[] args) {
		Bridge bridge = new MyBridge();
		
		// 调用第一个对象
		bridge.setSource(new SourceSub1());
		bridge.method();
		
		// 调用第二个对象
		bridge.setSource(new SourceSub2());
		bridge.method();
	}
}
