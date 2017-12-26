package com.tang.facade;

/**
 * 外观模式 Facade
 * 有了Computer类，他们之间的关系被放在了Computer类里，这样就起到了解耦的作用
 * @author TangXW
 *
 */
public class FacadeTest {
	public static void main(String[] args) {
		Computer computer = new Computer();
		
		computer.startup();
		computer.shutdown();
	}
}
